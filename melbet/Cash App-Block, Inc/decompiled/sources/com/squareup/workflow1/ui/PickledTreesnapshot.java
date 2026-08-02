package com.squareup.workflow1.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.workflow1.Snapshot;
import com.squareup.workflow1.Snapshots;
import com.squareup.workflow1.TreeSnapshot;
import net.idrnd.face.iad.capture.internal.e3;
import okio.Buffer;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PickledTreesnapshot implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR();
    public final TreeSnapshot snapshot;

    public final class CREATOR implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            ByteString.Companion companion = ByteString.Companion;
            byte[] createByteArray = parcel.createByteArray();
            createByteArray.getClass();
            ByteString of$default = ByteString.Companion.of$default(createByteArray);
            Buffer buffer = new Buffer();
            buffer.m4333write(of$default);
            ByteString readByteStringWithLength = Snapshots.readByteStringWithLength(buffer);
            readByteStringWithLength.getClass();
            return new PickledTreesnapshot(new TreeSnapshot(new Snapshot(new e3(readByteStringWithLength, 3)), new e3(buffer, 5)));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PickledTreesnapshot[i];
        }
    }

    public PickledTreesnapshot(TreeSnapshot treeSnapshot) {
        this.snapshot = treeSnapshot;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeByteArray(this.snapshot.toByteString().toByteArray());
    }
}
