package com.huawei.hms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.common.sqlite.HMSCursorWrapper;
import com.huawei.hms.support.log.HMSLog;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable, AutoCloseable {
    private static final String TAG = "DataHolder";
    public static final String TYPE_BOOLEAN = "type_boolean";
    public static final String TYPE_BYTE_ARRAY = "type_byte_array";
    public static final String TYPE_DOUBLE = "type_double";
    public static final String TYPE_FLOAT = "type_float";
    public static final String TYPE_INT = "type_int";
    public static final String TYPE_LONG = "type_long";
    public static final String TYPE_STRING = "type_string";
    private String[] columns;
    private Bundle columnsBundle;
    private CursorWindow[] cursorWindows;
    private int dataCount;
    private boolean isInstance;
    private boolean mClosed;
    private Bundle metadata;
    private int[] perCursorCounts;
    private int statusCode;
    private int version;
    public static final Parcelable.Creator<DataHolder> CREATOR = new DataHolderCreator();
    private static final Builder BUILDER = new DataHolderBuilderCreator(new String[0], null);

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String[] f14036a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<HashMap<String, Object>> f14037b;

        /* renamed from: c, reason: collision with root package name */
        private final String f14038c;

        /* renamed from: d, reason: collision with root package name */
        private final HashMap<Object, Integer> f14039d;

        /* JADX WARN: Multi-variable type inference failed */
        public DataHolder build(int i4) {
            return new DataHolder(this, i4, (Bundle) null);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder setDataForContentValuesHashMap(HashMap<String, Object> hashMap) {
            int i4;
            boolean z4;
            Object obj;
            Preconditions.checkNotNull(hashMap, "contentValuesHashMap cannot be null");
            String str = this.f14038c;
            if (str != null && (obj = hashMap.get(str)) != null) {
                Integer num = this.f14039d.get(obj);
                if (num != null) {
                    i4 = num.intValue();
                    z4 = true;
                    if (z4) {
                        this.f14037b.add(hashMap);
                        return this;
                    }
                    this.f14037b.remove(i4);
                    this.f14037b.add(i4, hashMap);
                    return this;
                }
                this.f14039d.put(obj, Integer.valueOf(this.f14037b.size()));
            }
            i4 = 0;
            z4 = false;
            if (z4) {
            }
        }

        public Builder withRow(ContentValues contentValues) {
            Preconditions.checkNotNull(contentValues, "contentValues cannot be null");
            HashMap<String, Object> hashMap = new HashMap<>(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return setDataForContentValuesHashMap(hashMap);
        }

        private Builder(String[] strArr, String str) {
            Preconditions.checkNotNull(strArr, "builderColumnsP cannot be null");
            this.f14036a = strArr;
            this.f14037b = new ArrayList<>();
            this.f14038c = str;
            this.f14039d = new HashMap<>();
        }

        public DataHolder build(int i4, Bundle bundle) {
            return new DataHolder(this, i4, bundle, -1);
        }

        Builder(String[] strArr, String str, DataHolderBuilderCreator dataHolderBuilderCreator) {
            this(strArr, null);
        }
    }

    public static class DataHolderException extends RuntimeException {
        public DataHolderException(String str) {
            super(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder builder(String[] strArr) {
        return new Builder(strArr, (String) null);
    }

    private void checkAvailable(String str, int i4) {
        String str2;
        Bundle bundle = this.columnsBundle;
        if (bundle == null || !bundle.containsKey(str)) {
            str2 = "cannot find column: " + str;
        } else if (isClosed()) {
            str2 = "buffer has been closed";
        } else if (i4 < 0 || i4 >= this.dataCount) {
            str2 = "row is out of index:" + i4;
        } else {
            str2 = "";
        }
        Preconditions.checkArgument(str2.isEmpty(), str2);
    }

    public static DataHolder empty(int i4) {
        return new DataHolder(BUILDER, i4, (Bundle) null);
    }

    private static CursorWindow[] getCursorWindows(HMSCursorWrapper hMSCursorWrapper) {
        int i4;
        ArrayList arrayList = new ArrayList();
        try {
            int count = hMSCursorWrapper.getCount();
            CursorWindow window = hMSCursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                i4 = 0;
            } else {
                window.acquireReference();
                hMSCursorWrapper.setWindow(null);
                arrayList.add(window);
                i4 = window.getNumRows();
            }
            arrayList.addAll(iterCursorWrapper(hMSCursorWrapper, i4, count));
            return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
        } catch (Throwable th) {
            try {
                HMSLog.e(TAG, "fail to getCursorWindows: " + th.getMessage());
                return new CursorWindow[0];
            } finally {
                hMSCursorWrapper.close();
            }
        }
    }

    private static ArrayList<CursorWindow> iterCursorWindow(Builder builder, int i4, List list) {
        CursorWindow cursorWindow;
        boolean z4;
        ArrayList<CursorWindow> arrayList = new ArrayList<>();
        CursorWindow cursorWindow2 = new CursorWindow((String) null);
        cursorWindow2.setNumColumns(builder.f14036a.length);
        arrayList.add(cursorWindow2);
        for (int i5 = 0; i5 < i4; i5++) {
            try {
                if (!cursorWindow2.allocRow()) {
                    HMSLog.d(TAG, "Failed to allocate a row");
                    cursorWindow = new CursorWindow((String) null);
                    try {
                        cursorWindow.setStartPosition(i5);
                        cursorWindow.setNumColumns(builder.f14036a.length);
                        if (!cursorWindow.allocRow()) {
                            HMSLog.e(TAG, "Failed to retry to allocate a row");
                            break;
                        }
                        arrayList.add(cursorWindow);
                        cursorWindow2 = cursorWindow;
                    } catch (RuntimeException unused) {
                        int size = arrayList.size();
                        int i6 = 0;
                        while (i6 < size) {
                            CursorWindow cursorWindow3 = arrayList.get(i6);
                            i6++;
                            cursorWindow3.close();
                        }
                        HMSLog.w(TAG, "iter CursorWindow failed, RuntimeException occured.");
                        cursorWindow2 = cursorWindow;
                    }
                }
                HashMap hashMap = (HashMap) list.get(i5);
                z4 = true;
                for (int i7 = 0; i7 < builder.f14036a.length && (z4 = putValue(cursorWindow2, hashMap.get(builder.f14036a[i7]), i5, i7)); i7++) {
                }
            } catch (RuntimeException unused2) {
                cursorWindow = cursorWindow2;
            }
            if (!z4) {
                HMSLog.d(TAG, "fail to put data for row " + i5);
                cursorWindow2.freeLastRow();
                CursorWindow cursorWindow4 = new CursorWindow((String) null);
                cursorWindow4.setStartPosition(i5);
                cursorWindow4.setNumColumns(builder.f14036a.length);
                arrayList.add(cursorWindow4);
                break;
            }
            continue;
        }
        return arrayList;
    }

    private static ArrayList<CursorWindow> iterCursorWrapper(HMSCursorWrapper hMSCursorWrapper, int i4, int i5) {
        ArrayList<CursorWindow> arrayList = new ArrayList<>();
        while (i4 < i5 && hMSCursorWrapper.moveToPosition(i4)) {
            CursorWindow window = hMSCursorWrapper.getWindow();
            if (window == null) {
                window = new CursorWindow((String) null);
                window.setStartPosition(i4);
                hMSCursorWrapper.fillWindow(i4, window);
            } else {
                window.acquireReference();
                hMSCursorWrapper.setWindow(null);
            }
            if (window.getNumRows() == 0) {
                break;
            }
            arrayList.add(window);
            i4 = window.getNumRows() + window.getStartPosition();
        }
        return arrayList;
    }

    private static boolean putValue(CursorWindow cursorWindow, Object obj, int i4, int i5) {
        if (obj == null) {
            return cursorWindow.putNull(i4, i5);
        }
        if (obj instanceof Boolean) {
            return cursorWindow.putLong(((Boolean) obj).booleanValue() ? 1L : 0L, i4, i5);
        }
        if (obj instanceof Integer) {
            return cursorWindow.putLong(((Integer) obj).intValue(), i4, i5);
        }
        if (obj instanceof Long) {
            return cursorWindow.putLong(((Long) obj).longValue(), i4, i5);
        }
        if (obj instanceof Float) {
            return cursorWindow.putDouble(((Float) obj).floatValue(), i4, i5);
        }
        if (obj instanceof Double) {
            return cursorWindow.putDouble(((Double) obj).doubleValue(), i4, i5);
        }
        if (obj instanceof String) {
            return cursorWindow.putString((String) obj, i4, i5);
        }
        if (obj instanceof byte[]) {
            return cursorWindow.putBlob((byte[]) obj, i4, i5);
        }
        throw new IllegalArgumentException("unsupported type for column: " + obj);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (!this.mClosed) {
                for (CursorWindow cursorWindow : this.cursorWindows) {
                    cursorWindow.close();
                }
                this.mClosed = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void collectColumsAndCount() {
        this.columnsBundle = new Bundle();
        String[] strArr = this.columns;
        int i4 = 0;
        if (strArr == null || strArr.length == 0) {
            this.dataCount = 0;
            return;
        }
        int i5 = 0;
        while (true) {
            String[] strArr2 = this.columns;
            if (i5 >= strArr2.length) {
                break;
            }
            this.columnsBundle.putInt(strArr2[i5], i5);
            i5++;
        }
        CursorWindow[] cursorWindowArr = this.cursorWindows;
        if (cursorWindowArr == null || cursorWindowArr.length == 0) {
            this.dataCount = 0;
            return;
        }
        this.perCursorCounts = new int[cursorWindowArr.length];
        int i6 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr2 = this.cursorWindows;
            if (i4 >= cursorWindowArr2.length) {
                this.dataCount = i6;
                return;
            } else {
                this.perCursorCounts[i4] = i6;
                i6 = cursorWindowArr2[i4].getStartPosition() + this.cursorWindows[i4].getNumRows();
                i4++;
            }
        }
    }

    public final void copyToBuffer(String str, int i4, int i5, CharArrayBuffer charArrayBuffer) {
        checkAvailable(str, i4);
        this.cursorWindows[i5].copyStringToBuffer(i4, this.columnsBundle.getInt(str), charArrayBuffer);
    }

    protected final void finalize() {
        if (this.isInstance && this.cursorWindows.length > 0 && !isClosed()) {
            close();
        }
        super.finalize();
    }

    public final int getCount() {
        return this.dataCount;
    }

    public final Bundle getMetadata() {
        return this.metadata;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final Object getValue(String str, int i4, int i5, String str2) {
        str2.getClass();
        switch (str2) {
            case "type_float":
                checkAvailable(str, i4);
                return Float.valueOf(this.cursorWindows[i5].getFloat(i4, this.columnsBundle.getInt(str)));
            case "type_boolean":
                checkAvailable(str, i4);
                return Boolean.valueOf(this.cursorWindows[i5].getLong(i4, this.columnsBundle.getInt(str)) == 1);
            case "type_int":
                checkAvailable(str, i4);
                return Integer.valueOf(this.cursorWindows[i5].getInt(i4, this.columnsBundle.getInt(str)));
            case "type_double":
                checkAvailable(str, i4);
                return Double.valueOf(this.cursorWindows[i5].getDouble(i4, this.columnsBundle.getInt(str)));
            case "type_long":
                checkAvailable(str, i4);
                return Long.valueOf(this.cursorWindows[i5].getLong(i4, this.columnsBundle.getInt(str)));
            case "type_string":
                checkAvailable(str, i4);
                return this.cursorWindows[i5].getString(i4, this.columnsBundle.getInt(str));
            case "type_byte_array":
                checkAvailable(str, i4);
                return this.cursorWindows[i5].getBlob(i4, this.columnsBundle.getInt(str));
            default:
                return null;
        }
    }

    public final int getWindowIndex(int i4) {
        int[] iArr;
        int i5 = 0;
        Preconditions.checkArgument(i4 >= 0 || i4 < this.dataCount, "rowIndex is out of index:" + i4);
        while (true) {
            iArr = this.perCursorCounts;
            if (i5 >= iArr.length) {
                break;
            }
            if (i4 < iArr[i5]) {
                i5--;
                break;
            }
            i5++;
        }
        return i5 == iArr.length ? i5 - 1 : i5;
    }

    public final boolean hasColumn(String str) {
        return this.columnsBundle.containsKey(str);
    }

    public final boolean hasNull(String str, int i4, int i5) {
        checkAvailable(str, i4);
        return this.cursorWindows[i5].getType(i4, this.columnsBundle.getInt(str)) == 0;
    }

    public final synchronized boolean isClosed() {
        return this.mClosed;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        if (parcel == null) {
            return;
        }
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.columns, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.cursorWindows, i4, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.version);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        if ((i4 & 1) != 0) {
            close();
        }
    }

    DataHolder(int i4, String[] strArr, CursorWindow[] cursorWindowArr, int i5, Bundle bundle) {
        this.mClosed = false;
        this.isInstance = true;
        this.version = i4;
        this.columns = strArr;
        this.cursorWindows = cursorWindowArr;
        this.statusCode = i5;
        this.metadata = bundle;
        collectColumsAndCount();
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i4, Bundle bundle) {
        Preconditions.checkNotNull(strArr, "columnsP cannot be null");
        Preconditions.checkNotNull(cursorWindowArr, "cursorWindowP cannot be null");
        this.mClosed = false;
        this.isInstance = true;
        this.version = 1;
        this.columns = strArr;
        this.cursorWindows = cursorWindowArr;
        this.statusCode = i4;
        this.metadata = bundle;
        collectColumsAndCount();
    }

    private static CursorWindow[] getCursorWindows(Builder builder, int i4) {
        if (builder.f14036a.length != 0) {
            if (i4 < 0 || i4 >= builder.f14037b.size()) {
                i4 = builder.f14037b.size();
            }
            ArrayList<CursorWindow> iterCursorWindow = iterCursorWindow(builder, i4, builder.f14037b.subList(0, i4));
            return (CursorWindow[]) iterCursorWindow.toArray(new CursorWindow[iterCursorWindow.size()]);
        }
        return new CursorWindow[0];
    }

    private DataHolder(HMSCursorWrapper hMSCursorWrapper, int i4, Bundle bundle) {
        this(hMSCursorWrapper.getColumnNames(), getCursorWindows(hMSCursorWrapper), i4, bundle);
    }

    public DataHolder(Cursor cursor, int i4, Bundle bundle) {
        this(new HMSCursorWrapper(cursor), i4, bundle);
    }

    private DataHolder(Builder builder, int i4, Bundle bundle) {
        this(builder.f14036a, getCursorWindows(builder, -1), i4, (Bundle) null);
    }

    private DataHolder(Builder builder, int i4, Bundle bundle, int i5) {
        this(builder.f14036a, getCursorWindows(builder, -1), i4, bundle);
    }
}
