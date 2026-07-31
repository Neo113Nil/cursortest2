package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.sqlite.CursorWrapper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable, AutoCloseable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new zae();
    private static final Builder zaf = new zab(new String[0], null);
    final int zaa;
    Bundle zab;
    int[] zac;
    int zad;
    boolean zae;
    private final String[] zag;
    private final CursorWindow[] zah;
    private final int zai;
    private final Bundle zaj;
    private boolean zak;

    public static class Builder {
        private final String[] zaa;
        private final ArrayList zab = new ArrayList();
        private final HashMap zac = new HashMap();

        /* synthetic */ Builder(String[] strArr, String str, zad zadVar) {
            this.zaa = (String[]) Preconditions.checkNotNull(strArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DataHolder build(int i4) {
            return new DataHolder(this, i4);
        }

        public Builder withRow(ContentValues contentValues) {
            Asserts.checkNotNull(contentValues);
            HashMap hashMap = new HashMap(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return zaa(hashMap);
        }

        public Builder zaa(HashMap hashMap) {
            Asserts.checkNotNull(hashMap);
            this.zab.add(hashMap);
            return this;
        }

        public DataHolder build(int i4, Bundle bundle) {
            return new DataHolder(this, i4, bundle);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder builder(String[] strArr) {
        return new Builder(strArr, null, 0 == true ? 1 : 0);
    }

    public static DataHolder empty(int i4) {
        return new DataHolder(zaf, i4, (Bundle) null);
    }

    private final void zae(String str, int i4) {
        Bundle bundle = this.zab;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
        }
        if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i4 < 0 || i4 >= this.zad) {
            throw new CursorIndexOutOfBoundsException(i4, this.zad);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0136, code lost:
    
        if (r5 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0138, code lost:
    
        android.util.Log.d("DataHolder", "Couldn't populate window data for row " + r4 + " - allocating new window.");
        r2.freeLastRow();
        r2 = new android.database.CursorWindow(false);
        r2.setStartPosition(r4);
        r2.setNumColumns(r13.zaa.length);
        r3.add(r2);
        r4 = r4 - 1;
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016a, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0174, code lost:
    
        throw new com.google.android.gms.common.data.zac("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static CursorWindow[] zaf(Builder builder, int i4) {
        if (builder.zaa.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList arrayList = builder.zab;
        int size = arrayList.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cursorWindow);
        cursorWindow.setNumColumns(builder.zaa.length);
        int i5 = 0;
        boolean z4 = false;
        while (i5 < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    Log.d("DataHolder", "Allocating additional cursor window for large data set (row " + i5 + ")");
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i5);
                    cursorWindow.setNumColumns(builder.zaa.length);
                    arrayList2.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList2.remove(cursorWindow);
                        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
                    }
                }
                Map map = (Map) arrayList.get(i5);
                int i6 = 0;
                boolean z5 = true;
                while (true) {
                    if (i6 < builder.zaa.length) {
                        if (!z5) {
                            break;
                        }
                        String str = builder.zaa[i6];
                        Object obj = map.get(str);
                        if (obj == null) {
                            z5 = cursorWindow.putNull(i5, i6);
                        } else if (obj instanceof String) {
                            z5 = cursorWindow.putString((String) obj, i5, i6);
                        } else if (obj instanceof Long) {
                            z5 = cursorWindow.putLong(((Long) obj).longValue(), i5, i6);
                        } else if (obj instanceof Integer) {
                            z5 = cursorWindow.putLong(((Integer) obj).intValue(), i5, i6);
                        } else if (obj instanceof Boolean) {
                            z5 = cursorWindow.putLong(true != ((Boolean) obj).booleanValue() ? 0L : 1L, i5, i6);
                        } else if (obj instanceof byte[]) {
                            z5 = cursorWindow.putBlob((byte[]) obj, i5, i6);
                        } else if (obj instanceof Double) {
                            z5 = cursorWindow.putDouble(((Double) obj).doubleValue(), i5, i6);
                        } else {
                            if (!(obj instanceof Float)) {
                                throw new IllegalArgumentException("Unsupported object for column " + str + ": " + obj.toString());
                            }
                            z5 = cursorWindow.putDouble(((Float) obj).floatValue(), i5, i6);
                        }
                        i6++;
                    } else if (z5) {
                        z4 = false;
                    }
                }
            } catch (RuntimeException e4) {
                int size2 = arrayList2.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    ((CursorWindow) arrayList2.get(i7)).close();
                }
                throw e4;
            }
        }
        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (!this.zae) {
                    this.zae = true;
                    int i4 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.zah;
                        if (i4 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i4].close();
                        i4++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final void finalize() {
        try {
            if (this.zak && this.zah.length > 0 && !isClosed()) {
                close();
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
            }
        } finally {
            super.finalize();
        }
    }

    public boolean getBoolean(String str, int i4, int i5) {
        zae(str, i4);
        return this.zah[i5].getLong(i4, this.zab.getInt(str)) == 1;
    }

    public byte[] getByteArray(String str, int i4, int i5) {
        zae(str, i4);
        return this.zah[i5].getBlob(i4, this.zab.getInt(str));
    }

    public int getCount() {
        return this.zad;
    }

    public int getInteger(String str, int i4, int i5) {
        zae(str, i4);
        return this.zah[i5].getInt(i4, this.zab.getInt(str));
    }

    public long getLong(String str, int i4, int i5) {
        zae(str, i4);
        return this.zah[i5].getLong(i4, this.zab.getInt(str));
    }

    public Bundle getMetadata() {
        return this.zaj;
    }

    public int getStatusCode() {
        return this.zai;
    }

    public String getString(String str, int i4, int i5) {
        zae(str, i4);
        return this.zah[i5].getString(i4, this.zab.getInt(str));
    }

    public int getWindowIndex(int i4) {
        int length;
        int i5 = 0;
        Preconditions.checkState(i4 >= 0 && i4 < this.zad);
        while (true) {
            int[] iArr = this.zac;
            length = iArr.length;
            if (i5 >= length) {
                break;
            }
            if (i4 < iArr[i5]) {
                i5--;
                break;
            }
            i5++;
        }
        return i5 == length ? i5 - 1 : i5;
    }

    public boolean hasColumn(String str) {
        return this.zab.containsKey(str);
    }

    public boolean hasNull(String str, int i4, int i5) {
        zae(str, i4);
        return this.zah[i5].isNull(i4, this.zab.getInt(str));
    }

    public boolean isClosed() {
        boolean z4;
        synchronized (this) {
            z4 = this.zae;
        }
        return z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        String[] strArr = this.zag;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, strArr, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zah, i4, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zaa);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        if ((i4 & 1) != 0) {
            close();
        }
    }

    public final double zaa(String str, int i4, int i5) {
        zae(str, i4);
        return this.zah[i5].getDouble(i4, this.zab.getInt(str));
    }

    public final float zab(String str, int i4, int i5) {
        zae(str, i4);
        return this.zah[i5].getFloat(i4, this.zab.getInt(str));
    }

    public final void zac(String str, int i4, int i5, CharArrayBuffer charArrayBuffer) {
        zae(str, i4);
        this.zah[i5].copyStringToBuffer(i4, this.zab.getInt(str), charArrayBuffer);
    }

    public final void zad() {
        this.zab = new Bundle();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            String[] strArr = this.zag;
            if (i5 >= strArr.length) {
                break;
            }
            this.zab.putInt(strArr[i5], i5);
            i5++;
        }
        this.zac = new int[this.zah.length];
        int i6 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.zah;
            if (i4 >= cursorWindowArr.length) {
                this.zad = i6;
                return;
            }
            this.zac[i4] = i6;
            i6 += this.zah[i4].getNumRows() - (i6 - cursorWindowArr[i4].getStartPosition());
            i4++;
        }
    }

    DataHolder(int i4, String[] strArr, CursorWindow[] cursorWindowArr, int i5, Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = i4;
        this.zag = strArr;
        this.zah = cursorWindowArr;
        this.zai = i5;
        this.zaj = bundle;
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i4, Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = 1;
        this.zag = (String[]) Preconditions.checkNotNull(strArr);
        this.zah = (CursorWindow[]) Preconditions.checkNotNull(cursorWindowArr);
        this.zai = i4;
        this.zaj = bundle;
        zad();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DataHolder(Cursor cursor, int i4, Bundle bundle) {
        this(r8, (CursorWindow[]) r1.toArray(new CursorWindow[r1.size()]), i4, bundle);
        int i5;
        CursorWrapper cursorWrapper = new CursorWrapper(cursor);
        String[] columnNames = cursorWrapper.getColumnNames();
        ArrayList arrayList = new ArrayList();
        try {
            int count = cursorWrapper.getCount();
            CursorWindow window = cursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                i5 = 0;
            } else {
                window.acquireReference();
                cursorWrapper.setWindow(null);
                arrayList.add(window);
                i5 = window.getNumRows();
            }
            while (i5 < count) {
                if (!cursorWrapper.moveToPosition(i5)) {
                    break;
                }
                CursorWindow window2 = cursorWrapper.getWindow();
                if (window2 != null) {
                    window2.acquireReference();
                    cursorWrapper.setWindow(null);
                } else {
                    window2 = new CursorWindow(false);
                    window2.setStartPosition(i5);
                    cursorWrapper.fillWindow(i5, window2);
                }
                if (window2.getNumRows() == 0) {
                    break;
                }
                arrayList.add(window2);
                i5 = window2.getStartPosition() + window2.getNumRows();
            }
            cursorWrapper.close();
        } catch (Throwable th) {
            cursorWrapper.close();
            throw th;
        }
    }

    private DataHolder(Builder builder, int i4, Bundle bundle) {
        this(builder.zaa, zaf(builder, -1), i4, (Bundle) null);
    }
}
