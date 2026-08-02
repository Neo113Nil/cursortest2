package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class yn {
    public yn() {
    }

    static View.AccessibilityDelegate a(View view) {
        View.AccessibilityDelegate accessibilityDelegate;
        accessibilityDelegate = view.getAccessibilityDelegate();
        return accessibilityDelegate;
    }

    static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    public static void c(boolean z, ym ymVar) {
        ymVar.g(z);
    }

    public static void d(boolean z, ym ymVar) {
        ymVar.h(z);
    }

    public static agd e(agh aghVar, ktj ktjVar, ago agoVar) {
        try {
            try {
                return aghVar.c(ktjVar, agoVar);
            } catch (AbstractMethodError unused) {
                return aghVar.a(ixf.f(ktjVar));
            }
        } catch (AbstractMethodError unused2) {
            return aghVar.b(ixf.f(ktjVar), agoVar);
        }
    }

    public static hvi f(final Executor executor, final String str, final kri kriVar) {
        executor.getClass();
        return ow.l(new ro() { // from class: ask
            @Override // defpackage.ro
            public final Object a(rm rmVar) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                rmVar.a(new nc(atomicBoolean, 20), asf.a);
                executor.execute(new ajx((Object) atomicBoolean, (Object) rmVar, (Object) kriVar, 2, (byte[]) null));
                return str;
            }
        });
    }

    public static /* synthetic */ hvi g(kqn kqnVar, krx krxVar) {
        kqnVar.getClass();
        return ow.l(new ati(kqnVar, krxVar, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static asa h(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream;
        int i;
        boolean z;
        Object obj;
        int length = bArr.length;
        if (length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        if (length == 0) {
            return asa.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            z = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
        } catch (IOException e) {
            asq.a().d(asb.a, "Error in Data#fromByteArray: ", e);
        } catch (ClassNotFoundException e2) {
            asq.a().d(asb.a, "Error in Data#fromByteArray: ", e2);
        }
        if (z) {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int readInt = objectInputStream.readInt();
                for (i = 0; i < readInt; i++) {
                    linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                }
                ixf.j(objectInputStream, null);
                return new asa(linkedHashMap);
            } finally {
            }
        } else {
            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
            try {
                short readShort = dataInputStream.readShort();
                if (readShort != -21521) {
                    throw new IllegalStateException(a.Y(readShort, "Magic number doesn't match: "));
                }
                short readShort2 = dataInputStream.readShort();
                if (readShort2 != 1) {
                    throw new IllegalStateException(a.Y(readShort2, "Unsupported version number: "));
                }
                int readInt2 = dataInputStream.readInt();
                for (int i2 = 0; i2 < readInt2; i2++) {
                    byte readByte = dataInputStream.readByte();
                    if (readByte == 0) {
                        obj = null;
                    } else if (readByte == 1) {
                        obj = Boolean.valueOf(dataInputStream.readBoolean());
                    } else if (readByte == 2) {
                        obj = Byte.valueOf(dataInputStream.readByte());
                    } else if (readByte == 3) {
                        obj = Integer.valueOf(dataInputStream.readInt());
                    } else if (readByte == 4) {
                        obj = Long.valueOf(dataInputStream.readLong());
                    } else if (readByte == 5) {
                        obj = Float.valueOf(dataInputStream.readFloat());
                    } else if (readByte == 6) {
                        obj = Double.valueOf(dataInputStream.readDouble());
                    } else if (readByte == 7) {
                        obj = dataInputStream.readUTF();
                    } else if (readByte == 8) {
                        int readInt3 = dataInputStream.readInt();
                        Boolean[] boolArr = new Boolean[readInt3];
                        for (int i3 = 0; i3 < readInt3; i3++) {
                            boolArr[i3] = Boolean.valueOf(dataInputStream.readBoolean());
                        }
                        obj = (Serializable) boolArr;
                    } else if (readByte == 9) {
                        int readInt4 = dataInputStream.readInt();
                        Byte[] bArr3 = new Byte[readInt4];
                        for (int i4 = 0; i4 < readInt4; i4++) {
                            bArr3[i4] = Byte.valueOf(dataInputStream.readByte());
                        }
                        obj = (Serializable) bArr3;
                    } else if (readByte == 10) {
                        int readInt5 = dataInputStream.readInt();
                        Integer[] numArr = new Integer[readInt5];
                        for (int i5 = 0; i5 < readInt5; i5++) {
                            numArr[i5] = Integer.valueOf(dataInputStream.readInt());
                        }
                        obj = (Serializable) numArr;
                    } else if (readByte == 11) {
                        int readInt6 = dataInputStream.readInt();
                        Long[] lArr = new Long[readInt6];
                        for (int i6 = 0; i6 < readInt6; i6++) {
                            lArr[i6] = Long.valueOf(dataInputStream.readLong());
                        }
                        obj = (Serializable) lArr;
                    } else if (readByte == 12) {
                        int readInt7 = dataInputStream.readInt();
                        Float[] fArr = new Float[readInt7];
                        for (int i7 = 0; i7 < readInt7; i7++) {
                            fArr[i7] = Float.valueOf(dataInputStream.readFloat());
                        }
                        obj = (Serializable) fArr;
                    } else if (readByte == 13) {
                        int readInt8 = dataInputStream.readInt();
                        Double[] dArr = new Double[readInt8];
                        for (int i8 = 0; i8 < readInt8; i8++) {
                            dArr[i8] = Double.valueOf(dataInputStream.readDouble());
                        }
                        obj = (Serializable) dArr;
                    } else {
                        if (readByte != 14) {
                            throw new IllegalStateException(a.Y(readByte, "Unsupported type "));
                        }
                        int readInt9 = dataInputStream.readInt();
                        String[] strArr = new String[readInt9];
                        for (int i9 = 0; i9 < readInt9; i9++) {
                            String readUTF = dataInputStream.readUTF();
                            if (true == ksp.b(readUTF, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                                readUTF = null;
                            }
                            strArr[i9] = readUTF;
                        }
                        obj = (Serializable) strArr;
                    }
                    linkedHashMap.put(dataInputStream.readUTF(), obj);
                }
                ixf.j(dataInputStream, null);
                return new asa(linkedHashMap);
            } finally {
            }
        }
    }

    public static byte[] i(asa asaVar) {
        int i;
        asaVar.getClass();
        int i2 = 0;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                int i3 = 1;
                dataOutputStream.writeShort(1);
                Map map = asaVar.b;
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value == null) {
                        dataOutputStream.writeByte(i2);
                    } else if (value instanceof Boolean) {
                        dataOutputStream.writeByte(i3);
                        dataOutputStream.writeBoolean(((Boolean) value).booleanValue());
                    } else if (value instanceof Byte) {
                        dataOutputStream.writeByte(2);
                        dataOutputStream.writeByte(((Number) value).byteValue());
                    } else if (value instanceof Integer) {
                        dataOutputStream.writeByte(3);
                        dataOutputStream.writeInt(((Number) value).intValue());
                    } else if (value instanceof Long) {
                        dataOutputStream.writeByte(4);
                        dataOutputStream.writeLong(((Number) value).longValue());
                    } else if (value instanceof Float) {
                        dataOutputStream.writeByte(5);
                        dataOutputStream.writeFloat(((Number) value).floatValue());
                    } else if (value instanceof Double) {
                        dataOutputStream.writeByte(6);
                        dataOutputStream.writeDouble(((Number) value).doubleValue());
                    } else if (value instanceof String) {
                        dataOutputStream.writeByte(7);
                        dataOutputStream.writeUTF((String) value);
                    } else {
                        if (!(value instanceof Object[])) {
                            Class<?> cls = value.getClass();
                            int i4 = ksx.a;
                            throw new IllegalArgumentException("Unsupported value type ".concat(String.valueOf(new ksj(cls).c())));
                        }
                        Object[] objArr = (Object[]) value;
                        Class<?> cls2 = objArr.getClass();
                        int i5 = ksx.a;
                        ksj ksjVar = new ksj(cls2);
                        int i6 = 11;
                        int i7 = 10;
                        int i8 = 8;
                        if (ksp.b(ksjVar, new ksj(Boolean[].class))) {
                            i = 8;
                        } else if (ksp.b(ksjVar, new ksj(Byte[].class))) {
                            i = 9;
                        } else if (ksp.b(ksjVar, new ksj(Integer[].class))) {
                            i = 10;
                        } else if (ksp.b(ksjVar, new ksj(Long[].class))) {
                            i = 11;
                        } else if (ksp.b(ksjVar, new ksj(Float[].class))) {
                            i = 12;
                        } else if (ksp.b(ksjVar, new ksj(Double[].class))) {
                            i = 13;
                        } else {
                            if (!ksp.b(ksjVar, new ksj(String[].class))) {
                                throw new IllegalArgumentException("Unsupported value type ".concat(String.valueOf(new ksj(objArr.getClass()).b())));
                            }
                            i = 14;
                        }
                        dataOutputStream.writeByte(i);
                        int length = objArr.length;
                        dataOutputStream.writeInt(length);
                        int i9 = 0;
                        while (i9 < length) {
                            Object obj = objArr[i9];
                            if (i == i8) {
                                Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                                dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                            } else if (i == 9) {
                                Byte b = obj instanceof Byte ? (Byte) obj : null;
                                dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                            } else if (i == i7) {
                                Integer num = obj instanceof Integer ? (Integer) obj : null;
                                dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                            } else if (i == i6) {
                                Long l = obj instanceof Long ? (Long) obj : null;
                                dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                            } else if (i == 12) {
                                Float f = obj instanceof Float ? (Float) obj : null;
                                dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                            } else if (i == 13) {
                                Double d = obj instanceof Double ? (Double) obj : null;
                                dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                            } else {
                                String str2 = obj instanceof String ? (String) obj : null;
                                if (str2 == null) {
                                    str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                                }
                                dataOutputStream.writeUTF(str2);
                            }
                            i9++;
                            i8 = 8;
                            i6 = 11;
                            i7 = 10;
                        }
                    }
                    dataOutputStream.writeUTF(str);
                    i2 = 0;
                    i3 = 1;
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ixf.j(dataOutputStream, null);
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } catch (IOException e) {
            asq.a().d(asb.a, "Error in Data#toByteArray: ", e);
            return new byte[0];
        }
    }

    public void l(int i) {
        throw null;
    }

    public yn(byte[] bArr, byte[] bArr2) {
    }

    public void j(int i) {
    }

    public void k(int i, float f, int i2) {
    }
}
