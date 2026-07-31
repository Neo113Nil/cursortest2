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

/* compiled from: com.google.android.gms:play-services-base@@18.9.0 */
/* loaded from: classes.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new zad();
    private static final Builder zak = new zab(new String[0], null);
    final int zaa;
    Bundle zab;
    int[] zac;
    int zad;
    boolean zae;
    private final String[] zaf;
    private final CursorWindow[] zag;
    private final int zah;
    private final Bundle zai;
    private boolean zaj;

    /* compiled from: com.google.android.gms:play-services-base@@18.9.0 */
    public static class Builder {
        private final String[] zaa;
        private final ArrayList zab = new ArrayList();
        private final HashMap zac = new HashMap();

        /* synthetic */ Builder(String[] strArr, String str, byte[] bArr) {
            this.zaa = (String[]) Preconditions.checkNotNull(strArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DataHolder build(int i) {
            return new DataHolder(this, i, (Bundle) null, (byte[]) (0 == true ? 1 : 0));
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

        final /* synthetic */ String[] zab() {
            return this.zaa;
        }

        final /* synthetic */ ArrayList zac() {
            return this.zab;
        }

        public DataHolder build(int i, Bundle bundle) {
            return new DataHolder(this, i, bundle, -1, (byte[]) null);
        }
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.zae = false;
        this.zaj = true;
        this.zaa = i;
        this.zaf = strArr;
        this.zag = cursorWindowArr;
        this.zah = i2;
        this.zai = bundle;
    }

    /* synthetic */ DataHolder(Builder builder, int i, Bundle bundle, byte[] bArr) {
        this(builder, i, (Bundle) null);
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i, Bundle bundle) {
        this.zae = false;
        this.zaj = true;
        this.zaa = 1;
        this.zaf = (String[]) Preconditions.checkNotNull(strArr);
        this.zag = (CursorWindow[]) Preconditions.checkNotNull(cursorWindowArr);
        this.zah = i;
        this.zai = bundle;
        zaa();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder builder(String[] strArr) {
        return new Builder(strArr, null, 0 == true ? 1 : 0);
    }

    public static DataHolder empty(int i) {
        return new DataHolder(zak, i, (Bundle) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0179, code lost:
    
        if (r12 != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017b, code lost:
    
        r5 = new java.lang.StringBuilder(java.lang.String.valueOf(r11).length() + 63);
        r5.append("Couldn't populate window data for row ");
        r5.append(r11);
        r5.append(" - allocating new window.");
        android.util.Log.d("DataHolder", r5.toString());
        r9.freeLastRow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x019f, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a0, code lost:
    
        r0 = new android.database.CursorWindow(false);
        r0.setStartPosition(r11);
        r0.setNumColumns(r21.zab().length);
        r10.add(r0);
        r11 = r11 - 1;
        r9 = r0;
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b6, code lost:
    
        r11 = r11 + 1;
        r7 = r5;
        r0 = r18;
        r5 = r19;
        r6 = r20;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ca, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01d1, code lost:
    
        r1 = r10.size();
        r7 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d8, code lost:
    
        ((android.database.CursorWindow) r10.get(r7)).close();
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01e4, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c1, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c9, code lost:
    
        throw new com.google.android.gms.common.data.zac("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.database.CursorWindow] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static CursorWindow[] zae(Builder builder, int i) {
        ?? r5;
        ArrayList arrayList;
        String str;
        String str2;
        String str3;
        String str4;
        boolean putDouble;
        String str5 = ")";
        String str6 = "Allocating additional cursor window for large data set (row ";
        boolean z = false;
        if (builder.zab().length == 0) {
            return new CursorWindow[0];
        }
        ArrayList zac = builder.zac();
        int size = zac.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cursorWindow);
        cursorWindow.setNumColumns(builder.zab().length);
        int i2 = 0;
        boolean z2 = false;
        CursorWindow cursorWindow2 = cursorWindow;
        while (i2 < size) {
            try {
                boolean allocRow = cursorWindow2.allocRow();
                ?? r9 = cursorWindow2;
                if (!allocRow) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 61);
                    sb.append(str6);
                    sb.append(i2);
                    sb.append(str5);
                    Log.d("DataHolder", sb.toString());
                    CursorWindow cursorWindow3 = new CursorWindow(z);
                    cursorWindow3.setStartPosition(i2);
                    cursorWindow3.setNumColumns(builder.zab().length);
                    arrayList2.add(cursorWindow3);
                    boolean allocRow2 = cursorWindow3.allocRow();
                    r9 = cursorWindow3;
                    if (!allocRow2) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList2.remove(cursorWindow3);
                        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
                    }
                }
                Map map = (Map) zac.get(i2);
                boolean z3 = true;
                ?? r7 = z;
                while (true) {
                    try {
                        if (r7 >= builder.zab().length) {
                            arrayList = zac;
                            str = str5;
                            str2 = str6;
                            if (z3) {
                                r5 = 0;
                                z2 = false;
                                CursorWindow cursorWindow4 = r9;
                            }
                        } else {
                            if (!z3) {
                                arrayList = zac;
                                str = str5;
                                str2 = str6;
                                break;
                            }
                            String str7 = builder.zab()[r7];
                            ArrayList arrayList3 = zac;
                            Object obj = map.get(str7);
                            if (obj == null) {
                                z3 = r9.putNull(i2, r7);
                                str3 = str5;
                            } else {
                                str3 = str5;
                                if (obj instanceof String) {
                                    z3 = r9.putString((String) obj, i2, r7);
                                } else {
                                    if (obj instanceof Long) {
                                        str4 = str6;
                                        putDouble = r9.putLong(((Long) obj).longValue(), i2, r7);
                                    } else {
                                        str4 = str6;
                                        if (obj instanceof Integer) {
                                            putDouble = r9.putLong(((Integer) obj).intValue(), i2, r7);
                                        } else if (obj instanceof Boolean) {
                                            putDouble = r9.putLong(true != ((Boolean) obj).booleanValue() ? 0L : 1L, i2, r7);
                                        } else if (obj instanceof byte[]) {
                                            putDouble = r9.putBlob((byte[]) obj, i2, r7);
                                        } else if (obj instanceof Double) {
                                            putDouble = r9.putDouble(((Double) obj).doubleValue(), i2, r7);
                                        } else {
                                            if (!(obj instanceof Float)) {
                                                String obj2 = obj.toString();
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(str7).length() + 32 + obj2.length());
                                                sb2.append("Unsupported object for column ");
                                                sb2.append(str7);
                                                sb2.append(": ");
                                                sb2.append(obj2);
                                                throw new IllegalArgumentException(sb2.toString());
                                            }
                                            putDouble = r9.putDouble(((Float) obj).floatValue(), i2, r7);
                                        }
                                    }
                                    z3 = putDouble;
                                    zac = arrayList3;
                                    str5 = str3;
                                    str6 = str4;
                                    r7++;
                                }
                            }
                            str4 = str6;
                            zac = arrayList3;
                            str5 = str3;
                            str6 = str4;
                            r7++;
                        }
                    } catch (RuntimeException e) {
                        e = e;
                        r5 = 0;
                    }
                }
            } catch (RuntimeException e2) {
                e = e2;
                r5 = z;
            }
        }
        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
    }

    private final void zaf(String str, int i) {
        Bundle bundle = this.zab;
        if (bundle == null || !bundle.containsKey(str)) {
            String.valueOf(str);
            throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
        }
        if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= this.zad) {
            throw new CursorIndexOutOfBoundsException(i, this.zad);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (!this.zae) {
                this.zae = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.zag;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.zaj && this.zag.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    public boolean getBoolean(String str, int i, int i2) {
        zaf(str, i);
        return Long.valueOf(this.zag[i2].getLong(i, this.zab.getInt(str))).longValue() == 1;
    }

    public byte[] getByteArray(String str, int i, int i2) {
        zaf(str, i);
        return this.zag[i2].getBlob(i, this.zab.getInt(str));
    }

    public int getCount() {
        return this.zad;
    }

    public int getInteger(String str, int i, int i2) {
        zaf(str, i);
        return this.zag[i2].getInt(i, this.zab.getInt(str));
    }

    public long getLong(String str, int i, int i2) {
        zaf(str, i);
        return this.zag[i2].getLong(i, this.zab.getInt(str));
    }

    public Bundle getMetadata() {
        return this.zai;
    }

    public int getStatusCode() {
        return this.zah;
    }

    public String getString(String str, int i, int i2) {
        zaf(str, i);
        return this.zag[i2].getString(i, this.zab.getInt(str));
    }

    public int getWindowIndex(int i) {
        int length;
        int i2 = 0;
        Preconditions.checkState(i >= 0 && i < this.zad);
        while (true) {
            int[] iArr = this.zac;
            length = iArr.length;
            if (i2 >= length) {
                break;
            }
            if (i < iArr[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == length ? i2 - 1 : i2;
    }

    public boolean hasColumn(String str) {
        return this.zab.containsKey(str);
    }

    public boolean hasNull(String str, int i, int i2) {
        zaf(str, i);
        return this.zag[i2].isNull(i, this.zab.getInt(str));
    }

    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.zae;
        }
        return z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String[] strArr = this.zaf;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, strArr, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zag, i, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zaa);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        if ((i & 1) != 0) {
            close();
        }
    }

    public final void zaa() {
        this.zab = new Bundle();
        int i = 0;
        while (true) {
            String[] strArr = this.zaf;
            if (i >= strArr.length) {
                break;
            }
            this.zab.putInt(strArr[i], i);
            i++;
        }
        CursorWindow[] cursorWindowArr = this.zag;
        this.zac = new int[cursorWindowArr.length];
        int i2 = 0;
        for (int i3 = 0; i3 < cursorWindowArr.length; i3++) {
            this.zac[i3] = i2;
            i2 += cursorWindowArr[i3].getNumRows() - (i2 - cursorWindowArr[i3].getStartPosition());
        }
        this.zad = i2;
    }

    public final float zab(String str, int i, int i2) {
        zaf(str, i);
        return this.zag[i2].getFloat(i, this.zab.getInt(str));
    }

    public final double zac(String str, int i, int i2) {
        zaf(str, i);
        return this.zag[i2].getDouble(i, this.zab.getInt(str));
    }

    public final void zad(String str, int i, int i2, CharArrayBuffer charArrayBuffer) {
        zaf(str, i);
        this.zag[i2].copyStringToBuffer(i, this.zab.getInt(str), charArrayBuffer);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DataHolder(Cursor cursor, int i, Bundle bundle) {
        this(r8, (CursorWindow[]) r1.toArray(new CursorWindow[r1.size()]), i, bundle);
        int i2;
        CursorWrapper cursorWrapper = new CursorWrapper(cursor);
        String[] columnNames = cursorWrapper.getColumnNames();
        ArrayList arrayList = new ArrayList();
        try {
            int count = cursorWrapper.getCount();
            CursorWindow window = cursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                i2 = 0;
            } else {
                window.acquireReference();
                cursorWrapper.setWindow(null);
                arrayList.add(window);
                i2 = window.getNumRows();
            }
            while (i2 < count) {
                if (!cursorWrapper.moveToPosition(i2)) {
                    break;
                }
                CursorWindow window2 = cursorWrapper.getWindow();
                if (window2 != null) {
                    window2.acquireReference();
                    cursorWrapper.setWindow(null);
                } else {
                    window2 = new CursorWindow(false);
                    window2.setStartPosition(i2);
                    cursorWrapper.fillWindow(i2, window2);
                }
                if (window2.getNumRows() == 0) {
                    break;
                }
                arrayList.add(window2);
                i2 = window2.getStartPosition() + window2.getNumRows();
            }
            cursorWrapper.close();
        } catch (Throwable th) {
            cursorWrapper.close();
            throw th;
        }
    }

    private DataHolder(Builder builder, int i, Bundle bundle) {
        this(builder.zab(), zae(builder, -1), i, (Bundle) null);
    }

    /* synthetic */ DataHolder(Builder builder, int i, Bundle bundle, int i2, byte[] bArr) {
        this(builder.zab(), zae(builder, -1), i, bundle);
    }
}
