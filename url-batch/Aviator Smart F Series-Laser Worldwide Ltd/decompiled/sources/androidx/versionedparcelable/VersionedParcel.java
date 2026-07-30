package androidx.versionedparcelable;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import com.baidu.location.LocationConst;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class VersionedParcel {
    private static final int EX_BAD_PARCELABLE = -2;
    private static final int EX_ILLEGAL_ARGUMENT = -3;
    private static final int EX_ILLEGAL_STATE = -5;
    private static final int EX_NETWORK_MAIN_THREAD = -6;
    private static final int EX_NULL_POINTER = -4;
    private static final int EX_PARCELABLE = -9;
    private static final int EX_SECURITY = -1;
    private static final int EX_UNSUPPORTED_OPERATION = -7;
    private static final String TAG = "VersionedParcel";
    private static final int TYPE_BINDER = 5;
    private static final int TYPE_FLOAT = 8;
    private static final int TYPE_INTEGER = 7;
    private static final int TYPE_PARCELABLE = 2;
    private static final int TYPE_SERIALIZABLE = 3;
    private static final int TYPE_STRING = 4;
    private static final int TYPE_VERSIONED_PARCELABLE = 1;
    protected final ArrayMap<String, Class> mParcelizerCache;
    protected final ArrayMap<String, Method> mReadCache;
    protected final ArrayMap<String, Method> mWriteCache;

    public static class ParcelException extends RuntimeException {
        public ParcelException(Throwable th) {
            super(th);
        }
    }

    public VersionedParcel(ArrayMap<String, Method> arrayMap, ArrayMap<String, Method> arrayMap2, ArrayMap<String, Class> arrayMap3) {
        this.mReadCache = arrayMap;
        this.mWriteCache = arrayMap2;
        this.mParcelizerCache = arrayMap3;
    }

    private Exception createException(int i8, String str) {
        switch (i8) {
            case -9:
                return (Exception) readParcelable();
            case LocationConst.TrafficStatus.TRAFFIC_ERROR_MODEL_LOAD_FAILED /* -8 */:
            default:
                return new RuntimeException("Unknown exception code: " + i8 + " msg " + str);
            case -7:
                return new UnsupportedOperationException(str);
            case -6:
                return new NetworkOnMainThreadException();
            case -5:
                return new IllegalStateException(str);
            case -4:
                return new NullPointerException(str);
            case -3:
                return new IllegalArgumentException(str);
            case -2:
                return new BadParcelableException(str);
            case -1:
                return new SecurityException(str);
        }
    }

    private Class findParcelClass(Class<? extends VersionedParcelable> cls) {
        Class cls2 = this.mParcelizerCache.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.mParcelizerCache.put(cls.getName(), cls3);
        return cls3;
    }

    private Method getReadMethod(String str) {
        Method method = this.mReadCache.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        this.mReadCache.put(str, declaredMethod);
        return declaredMethod;
    }

    @NonNull
    protected static Throwable getRootCause(@NonNull Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    private <T> int getType(T t7) {
        if (t7 instanceof String) {
            return 4;
        }
        if (t7 instanceof Parcelable) {
            return 2;
        }
        if (t7 instanceof VersionedParcelable) {
            return 1;
        }
        if (t7 instanceof Serializable) {
            return 3;
        }
        if (t7 instanceof IBinder) {
            return 5;
        }
        if (t7 instanceof Integer) {
            return 7;
        }
        if (t7 instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(t7.getClass().getName() + " cannot be VersionedParcelled");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Method getWriteMethod(Class cls) {
        Method method = this.mWriteCache.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class findParcelClass = findParcelClass(cls);
        System.currentTimeMillis();
        Method declaredMethod = findParcelClass.getDeclaredMethod("write", cls, VersionedParcel.class);
        this.mWriteCache.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    private <T, S extends Collection<T>> S readCollection(S s7) {
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        if (readInt != 0) {
            int readInt2 = readInt();
            if (readInt < 0) {
                return null;
            }
            if (readInt2 == 1) {
                while (readInt > 0) {
                    s7.add(readVersionedParcelable());
                    readInt--;
                }
            } else if (readInt2 == 2) {
                while (readInt > 0) {
                    s7.add(readParcelable());
                    readInt--;
                }
            } else if (readInt2 == 3) {
                while (readInt > 0) {
                    s7.add(readSerializable());
                    readInt--;
                }
            } else if (readInt2 == 4) {
                while (readInt > 0) {
                    s7.add(readString());
                    readInt--;
                }
            } else if (readInt2 == 5) {
                while (readInt > 0) {
                    s7.add(readStrongBinder());
                    readInt--;
                }
            }
        }
        return s7;
    }

    private int readExceptionCode() {
        return readInt();
    }

    private <T> void writeCollection(Collection<T> collection, int i8) {
        setOutputField(i8);
        writeCollection(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void writeVersionedParcelableCreator(VersionedParcelable versionedParcelable) {
        try {
            writeString(findParcelClass(versionedParcelable.getClass()).getName());
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException(versionedParcelable.getClass().getSimpleName() + " does not have a Parcelizer", e8);
        }
    }

    protected abstract void closeField();

    protected abstract VersionedParcel createSubParcel();

    public boolean isStream() {
        return false;
    }

    public <T> T[] readArray(T[] tArr, int i8) {
        return !readField(i8) ? tArr : (T[]) readArray(tArr);
    }

    protected abstract boolean readBoolean();

    public boolean readBoolean(boolean z7, int i8) {
        return !readField(i8) ? z7 : readBoolean();
    }

    public boolean[] readBooleanArray(boolean[] zArr, int i8) {
        return !readField(i8) ? zArr : readBooleanArray();
    }

    protected abstract Bundle readBundle();

    public Bundle readBundle(Bundle bundle, int i8) {
        return !readField(i8) ? bundle : readBundle();
    }

    public byte readByte(byte b8, int i8) {
        return !readField(i8) ? b8 : (byte) (readInt() & 255);
    }

    protected abstract byte[] readByteArray();

    public byte[] readByteArray(byte[] bArr, int i8) {
        return !readField(i8) ? bArr : readByteArray();
    }

    public char[] readCharArray(char[] cArr, int i8) {
        if (!readField(i8)) {
            return cArr;
        }
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        char[] cArr2 = new char[readInt];
        for (int i9 = 0; i9 < readInt; i9++) {
            cArr2[i9] = (char) readInt();
        }
        return cArr2;
    }

    protected abstract CharSequence readCharSequence();

    public CharSequence readCharSequence(CharSequence charSequence, int i8) {
        return !readField(i8) ? charSequence : readCharSequence();
    }

    protected abstract double readDouble();

    public double readDouble(double d8, int i8) {
        return !readField(i8) ? d8 : readDouble();
    }

    public double[] readDoubleArray(double[] dArr, int i8) {
        return !readField(i8) ? dArr : readDoubleArray();
    }

    public Exception readException(Exception exc, int i8) {
        int readExceptionCode;
        return (readField(i8) && (readExceptionCode = readExceptionCode()) != 0) ? readException(readExceptionCode, readString()) : exc;
    }

    protected abstract boolean readField(int i8);

    protected abstract float readFloat();

    public float readFloat(float f8, int i8) {
        return !readField(i8) ? f8 : readFloat();
    }

    public float[] readFloatArray(float[] fArr, int i8) {
        return !readField(i8) ? fArr : readFloatArray();
    }

    protected <T extends VersionedParcelable> T readFromParcel(String str, VersionedParcel versionedParcel) {
        try {
            return (T) getReadMethod(str).invoke(null, versionedParcel);
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e8);
        } catch (IllegalAccessException e9) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e9);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e10);
        } catch (InvocationTargetException e11) {
            if (e11.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e11.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
        }
    }

    protected abstract int readInt();

    public int readInt(int i8, int i9) {
        return !readField(i9) ? i8 : readInt();
    }

    public int[] readIntArray(int[] iArr, int i8) {
        return !readField(i8) ? iArr : readIntArray();
    }

    public <T> List<T> readList(List<T> list, int i8) {
        return !readField(i8) ? list : (List) readCollection(new ArrayList());
    }

    protected abstract long readLong();

    public long readLong(long j8, int i8) {
        return !readField(i8) ? j8 : readLong();
    }

    public long[] readLongArray(long[] jArr, int i8) {
        return !readField(i8) ? jArr : readLongArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K, V> Map<K, V> readMap(Map<K, V> map, int i8) {
        if (!readField(i8)) {
            return map;
        }
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        ArrayMap arrayMap = new ArrayMap();
        if (readInt == 0) {
            return arrayMap;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        readCollection(arrayList);
        readCollection(arrayList2);
        for (int i9 = 0; i9 < readInt; i9++) {
            arrayMap.put(arrayList.get(i9), arrayList2.get(i9));
        }
        return arrayMap;
    }

    protected abstract <T extends Parcelable> T readParcelable();

    public <T extends Parcelable> T readParcelable(T t7, int i8) {
        return !readField(i8) ? t7 : (T) readParcelable();
    }

    protected Serializable readSerializable() {
        String readString = readString();
        if (readString == null) {
            return null;
        }
        try {
            return (Serializable) new ObjectInputStream(new ByteArrayInputStream(readByteArray())) { // from class: androidx.versionedparcelable.VersionedParcel.1
                @Override // java.io.ObjectInputStream
                protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
                    Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
                    return cls != null ? cls : super.resolveClass(objectStreamClass);
                }
            }.readObject();
        } catch (IOException e8) {
            throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + readString + ")", e8);
        } catch (ClassNotFoundException e9) {
            throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + readString + ")", e9);
        }
    }

    public <T> Set<T> readSet(Set<T> set, int i8) {
        return !readField(i8) ? set : (Set) readCollection(new ArraySet());
    }

    @RequiresApi(api = 21)
    public Size readSize(Size size, int i8) {
        if (!readField(i8)) {
            return size;
        }
        if (readBoolean()) {
            return new Size(readInt(), readInt());
        }
        return null;
    }

    @RequiresApi(api = 21)
    public SizeF readSizeF(SizeF sizeF, int i8) {
        if (!readField(i8)) {
            return sizeF;
        }
        if (readBoolean()) {
            return new SizeF(readFloat(), readFloat());
        }
        return null;
    }

    public SparseBooleanArray readSparseBooleanArray(SparseBooleanArray sparseBooleanArray, int i8) {
        if (!readField(i8)) {
            return sparseBooleanArray;
        }
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(readInt);
        for (int i9 = 0; i9 < readInt; i9++) {
            sparseBooleanArray2.put(readInt(), readBoolean());
        }
        return sparseBooleanArray2;
    }

    protected abstract String readString();

    public String readString(String str, int i8) {
        return !readField(i8) ? str : readString();
    }

    protected abstract IBinder readStrongBinder();

    public IBinder readStrongBinder(IBinder iBinder, int i8) {
        return !readField(i8) ? iBinder : readStrongBinder();
    }

    public <T extends VersionedParcelable> T readVersionedParcelable(T t7, int i8) {
        return !readField(i8) ? t7 : (T) readVersionedParcelable();
    }

    protected abstract void setOutputField(int i8);

    public void setSerializationFlags(boolean z7, boolean z8) {
    }

    public <T> void writeArray(T[] tArr, int i8) {
        setOutputField(i8);
        writeArray(tArr);
    }

    protected abstract void writeBoolean(boolean z7);

    public void writeBoolean(boolean z7, int i8) {
        setOutputField(i8);
        writeBoolean(z7);
    }

    public void writeBooleanArray(boolean[] zArr, int i8) {
        setOutputField(i8);
        writeBooleanArray(zArr);
    }

    protected abstract void writeBundle(Bundle bundle);

    public void writeBundle(Bundle bundle, int i8) {
        setOutputField(i8);
        writeBundle(bundle);
    }

    public void writeByte(byte b8, int i8) {
        setOutputField(i8);
        writeInt(b8);
    }

    protected abstract void writeByteArray(byte[] bArr);

    public void writeByteArray(byte[] bArr, int i8) {
        setOutputField(i8);
        writeByteArray(bArr);
    }

    protected abstract void writeByteArray(byte[] bArr, int i8, int i9);

    public void writeCharArray(char[] cArr, int i8) {
        setOutputField(i8);
        if (cArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(cArr.length);
        for (char c8 : cArr) {
            writeInt(c8);
        }
    }

    protected abstract void writeCharSequence(CharSequence charSequence);

    public void writeCharSequence(CharSequence charSequence, int i8) {
        setOutputField(i8);
        writeCharSequence(charSequence);
    }

    protected abstract void writeDouble(double d8);

    public void writeDouble(double d8, int i8) {
        setOutputField(i8);
        writeDouble(d8);
    }

    public void writeDoubleArray(double[] dArr, int i8) {
        setOutputField(i8);
        writeDoubleArray(dArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeException(Exception exc, int i8) {
        setOutputField(i8);
        if (exc == 0) {
            writeNoException();
            return;
        }
        int i9 = ((exc instanceof Parcelable) && exc.getClass().getClassLoader() == Parcelable.class.getClassLoader()) ? -9 : exc instanceof SecurityException ? -1 : exc instanceof BadParcelableException ? -2 : exc instanceof IllegalArgumentException ? -3 : exc instanceof NullPointerException ? -4 : exc instanceof IllegalStateException ? -5 : exc instanceof NetworkOnMainThreadException ? -6 : exc instanceof UnsupportedOperationException ? -7 : 0;
        writeInt(i9);
        if (i9 == 0) {
            if (!(exc instanceof RuntimeException)) {
                throw new RuntimeException(exc);
            }
            throw ((RuntimeException) exc);
        }
        writeString(exc.getMessage());
        if (i9 != -9) {
            return;
        }
        writeParcelable((Parcelable) exc);
    }

    protected abstract void writeFloat(float f8);

    public void writeFloat(float f8, int i8) {
        setOutputField(i8);
        writeFloat(f8);
    }

    public void writeFloatArray(float[] fArr, int i8) {
        setOutputField(i8);
        writeFloatArray(fArr);
    }

    protected abstract void writeInt(int i8);

    public void writeInt(int i8, int i9) {
        setOutputField(i9);
        writeInt(i8);
    }

    public void writeIntArray(int[] iArr, int i8) {
        setOutputField(i8);
        writeIntArray(iArr);
    }

    public <T> void writeList(List<T> list, int i8) {
        writeCollection(list, i8);
    }

    protected abstract void writeLong(long j8);

    public void writeLong(long j8, int i8) {
        setOutputField(i8);
        writeLong(j8);
    }

    public void writeLongArray(long[] jArr, int i8) {
        setOutputField(i8);
        writeLongArray(jArr);
    }

    public <K, V> void writeMap(Map<K, V> map, int i8) {
        setOutputField(i8);
        if (map == null) {
            writeInt(-1);
            return;
        }
        int size = map.size();
        writeInt(size);
        if (size == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            arrayList.add(entry.getKey());
            arrayList2.add(entry.getValue());
        }
        writeCollection(arrayList);
        writeCollection(arrayList2);
    }

    protected void writeNoException() {
        writeInt(0);
    }

    protected abstract void writeParcelable(Parcelable parcelable);

    public void writeParcelable(Parcelable parcelable, int i8) {
        setOutputField(i8);
        writeParcelable(parcelable);
    }

    public void writeSerializable(Serializable serializable, int i8) {
        setOutputField(i8);
        writeSerializable(serializable);
    }

    public <T> void writeSet(Set<T> set, int i8) {
        writeCollection(set, i8);
    }

    @RequiresApi(api = 21)
    public void writeSize(Size size, int i8) {
        setOutputField(i8);
        writeBoolean(size != null);
        if (size != null) {
            writeInt(size.getWidth());
            writeInt(size.getHeight());
        }
    }

    @RequiresApi(api = 21)
    public void writeSizeF(SizeF sizeF, int i8) {
        setOutputField(i8);
        writeBoolean(sizeF != null);
        if (sizeF != null) {
            writeFloat(sizeF.getWidth());
            writeFloat(sizeF.getHeight());
        }
    }

    public void writeSparseBooleanArray(SparseBooleanArray sparseBooleanArray, int i8) {
        setOutputField(i8);
        if (sparseBooleanArray == null) {
            writeInt(-1);
            return;
        }
        int size = sparseBooleanArray.size();
        writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            writeInt(sparseBooleanArray.keyAt(i9));
            writeBoolean(sparseBooleanArray.valueAt(i9));
        }
    }

    protected abstract void writeString(String str);

    public void writeString(String str, int i8) {
        setOutputField(i8);
        writeString(str);
    }

    protected abstract void writeStrongBinder(IBinder iBinder);

    public void writeStrongBinder(IBinder iBinder, int i8) {
        setOutputField(i8);
        writeStrongBinder(iBinder);
    }

    protected abstract void writeStrongInterface(IInterface iInterface);

    public void writeStrongInterface(IInterface iInterface, int i8) {
        setOutputField(i8);
        writeStrongInterface(iInterface);
    }

    protected <T extends VersionedParcelable> void writeToParcel(T t7, VersionedParcel versionedParcel) {
        try {
            getWriteMethod(t7.getClass()).invoke(null, t7, versionedParcel);
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e8);
        } catch (IllegalAccessException e9) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e9);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e10);
        } catch (InvocationTargetException e11) {
            if (!(e11.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
            }
            throw ((RuntimeException) e11.getCause());
        }
    }

    public void writeVersionedParcelable(VersionedParcelable versionedParcelable, int i8) {
        setOutputField(i8);
        writeVersionedParcelable(versionedParcelable);
    }

    private <T> void writeCollection(Collection<T> collection) {
        if (collection == null) {
            writeInt(-1);
        }
        int size = collection.size();
        writeInt(size);
        if (size > 0) {
            int type = getType(collection.iterator().next());
            writeInt(type);
            switch (type) {
                case 1:
                    Iterator<T> it = collection.iterator();
                    while (it.hasNext()) {
                        writeVersionedParcelable((VersionedParcelable) it.next());
                    }
                    break;
                case 2:
                    Iterator<T> it2 = collection.iterator();
                    while (it2.hasNext()) {
                        writeParcelable((Parcelable) it2.next());
                    }
                    break;
                case 3:
                    Iterator<T> it3 = collection.iterator();
                    while (it3.hasNext()) {
                        writeSerializable((Serializable) it3.next());
                    }
                    break;
                case 4:
                    Iterator<T> it4 = collection.iterator();
                    while (it4.hasNext()) {
                        writeString((String) it4.next());
                    }
                    break;
                case 5:
                    Iterator<T> it5 = collection.iterator();
                    while (it5.hasNext()) {
                        writeStrongBinder((IBinder) it5.next());
                    }
                    break;
                case 7:
                    Iterator<T> it6 = collection.iterator();
                    while (it6.hasNext()) {
                        writeInt(((Integer) it6.next()).intValue());
                    }
                    break;
                case 8:
                    Iterator<T> it7 = collection.iterator();
                    while (it7.hasNext()) {
                        writeFloat(((Float) it7.next()).floatValue());
                    }
                    break;
            }
        }
    }

    private void writeSerializable(Serializable serializable) {
        if (serializable == null) {
            writeString(null);
            return;
        }
        String name = serializable.getClass().getName();
        writeString(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            writeByteArray(byteArrayOutputStream.toByteArray());
        } catch (IOException e8) {
            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + ")", e8);
        }
    }

    protected <T> T[] readArray(T[] tArr) {
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(readInt);
        if (readInt != 0) {
            int readInt2 = readInt();
            if (readInt < 0) {
                return null;
            }
            if (readInt2 == 1) {
                while (readInt > 0) {
                    arrayList.add(readVersionedParcelable());
                    readInt--;
                }
            } else if (readInt2 == 2) {
                while (readInt > 0) {
                    arrayList.add(readParcelable());
                    readInt--;
                }
            } else if (readInt2 == 3) {
                while (readInt > 0) {
                    arrayList.add(readSerializable());
                    readInt--;
                }
            } else if (readInt2 == 4) {
                while (readInt > 0) {
                    arrayList.add(readString());
                    readInt--;
                }
            } else if (readInt2 == 5) {
                while (readInt > 0) {
                    arrayList.add(readStrongBinder());
                    readInt--;
                }
            }
        }
        return (T[]) arrayList.toArray(tArr);
    }

    protected boolean[] readBooleanArray() {
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        boolean[] zArr = new boolean[readInt];
        for (int i8 = 0; i8 < readInt; i8++) {
            zArr[i8] = readInt() != 0;
        }
        return zArr;
    }

    protected double[] readDoubleArray() {
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        double[] dArr = new double[readInt];
        for (int i8 = 0; i8 < readInt; i8++) {
            dArr[i8] = readDouble();
        }
        return dArr;
    }

    protected float[] readFloatArray() {
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        float[] fArr = new float[readInt];
        for (int i8 = 0; i8 < readInt; i8++) {
            fArr[i8] = readFloat();
        }
        return fArr;
    }

    protected int[] readIntArray() {
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        int[] iArr = new int[readInt];
        for (int i8 = 0; i8 < readInt; i8++) {
            iArr[i8] = readInt();
        }
        return iArr;
    }

    protected long[] readLongArray() {
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        long[] jArr = new long[readInt];
        for (int i8 = 0; i8 < readInt; i8++) {
            jArr[i8] = readLong();
        }
        return jArr;
    }

    protected <T extends VersionedParcelable> T readVersionedParcelable() {
        String readString = readString();
        if (readString == null) {
            return null;
        }
        return (T) readFromParcel(readString, createSubParcel());
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected <T> void writeArray(T[] tArr) {
        if (tArr == 0) {
            writeInt(-1);
            return;
        }
        int length = tArr.length;
        writeInt(length);
        if (length > 0) {
            int i8 = 0;
            int type = getType(tArr[0]);
            writeInt(type);
            if (type == 1) {
                while (i8 < length) {
                    writeVersionedParcelable((VersionedParcelable) tArr[i8]);
                    i8++;
                }
                return;
            }
            if (type == 2) {
                while (i8 < length) {
                    writeParcelable((Parcelable) tArr[i8]);
                    i8++;
                }
                return;
            }
            if (type == 3) {
                while (i8 < length) {
                    writeSerializable((Serializable) tArr[i8]);
                    i8++;
                }
            } else if (type == 4) {
                while (i8 < length) {
                    writeString((String) tArr[i8]);
                    i8++;
                }
            } else {
                if (type != 5) {
                    return;
                }
                while (i8 < length) {
                    writeStrongBinder((IBinder) tArr[i8]);
                    i8++;
                }
            }
        }
    }

    protected void writeBooleanArray(boolean[] zArr) {
        if (zArr != null) {
            writeInt(zArr.length);
            for (boolean z7 : zArr) {
                writeInt(z7 ? 1 : 0);
            }
            return;
        }
        writeInt(-1);
    }

    public void writeByteArray(byte[] bArr, int i8, int i9, int i10) {
        setOutputField(i10);
        writeByteArray(bArr, i8, i9);
    }

    protected void writeDoubleArray(double[] dArr) {
        if (dArr != null) {
            writeInt(dArr.length);
            for (double d8 : dArr) {
                writeDouble(d8);
            }
            return;
        }
        writeInt(-1);
    }

    protected void writeFloatArray(float[] fArr) {
        if (fArr != null) {
            writeInt(fArr.length);
            for (float f8 : fArr) {
                writeFloat(f8);
            }
            return;
        }
        writeInt(-1);
    }

    protected void writeIntArray(int[] iArr) {
        if (iArr != null) {
            writeInt(iArr.length);
            for (int i8 : iArr) {
                writeInt(i8);
            }
            return;
        }
        writeInt(-1);
    }

    protected void writeLongArray(long[] jArr) {
        if (jArr != null) {
            writeInt(jArr.length);
            for (long j8 : jArr) {
                writeLong(j8);
            }
            return;
        }
        writeInt(-1);
    }

    protected void writeVersionedParcelable(VersionedParcelable versionedParcelable) {
        if (versionedParcelable == null) {
            writeString(null);
            return;
        }
        writeVersionedParcelableCreator(versionedParcelable);
        VersionedParcel createSubParcel = createSubParcel();
        writeToParcel(versionedParcelable, createSubParcel);
        createSubParcel.closeField();
    }

    private Exception readException(int i8, String str) {
        return createException(i8, str);
    }
}
