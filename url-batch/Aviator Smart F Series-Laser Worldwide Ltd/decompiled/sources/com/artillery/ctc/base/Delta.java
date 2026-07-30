package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class Delta implements Parcelable {
    public static final Parcelable.Creator<Delta> CREATOR = new a();
    private final List<Content> content;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Delta createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(Content.CREATOR.createFromParcel(parcel));
            }
            return new Delta(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Delta[] newArray(int i8) {
            return new Delta[i8];
        }
    }

    public Delta(List<Content> content) {
        s.checkNotNullParameter(content, "content");
        this.content = content;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Delta copy$default(Delta delta, List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            list = delta.content;
        }
        return delta.copy(list);
    }

    public final List<Content> component1() {
        return this.content;
    }

    public final Delta copy(List<Content> content) {
        s.checkNotNullParameter(content, "content");
        return new Delta(content);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Delta) && s.areEqual(this.content, ((Delta) obj).content);
    }

    public final List<Content> getContent() {
        return this.content;
    }

    public int hashCode() {
        return this.content.hashCode();
    }

    public String toString() {
        return "Delta(content=" + this.content + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        List<Content> list = this.content;
        out.writeInt(list.size());
        Iterator<Content> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(out, i8);
        }
    }
}
