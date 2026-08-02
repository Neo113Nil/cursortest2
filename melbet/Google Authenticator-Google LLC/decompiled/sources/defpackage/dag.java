package defpackage;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dag implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ctv(9);
    private final Cursor a;
    private final int b;

    public dag(Cursor cursor) {
        this.a = cursor;
        this.b = cursor == null ? 0 : cursor.getCount();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Cursor cursor = this.a;
        if (cursor == null) {
            parcel.writeInt(0);
            parcel.writeStringArray(new String[0]);
            parcel.writeInt(0);
            return;
        }
        try {
            int columnCount = cursor.getColumnCount();
            parcel.writeInt(columnCount);
            parcel.writeStringArray(cursor.getColumnNames());
            parcel.writeInt(this.b);
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                Object[] objArr = new Object[columnCount];
                for (int i2 = 0; i2 < columnCount; i2++) {
                    int type = cursor.getType(i2);
                    if (type == 0) {
                        objArr[i2] = null;
                    } else if (type == 1) {
                        objArr[i2] = Integer.valueOf(cursor.getInt(i2));
                    } else if (type == 2) {
                        objArr[i2] = Float.valueOf(cursor.getFloat(i2));
                    } else if (type == 3) {
                        objArr[i2] = cursor.getString(i2);
                    } else if (type == 4) {
                        objArr[i2] = cursor.getBlob(i2);
                    }
                }
                parcel.writeArray(objArr);
            }
        } finally {
            this.a.close();
        }
    }
}
