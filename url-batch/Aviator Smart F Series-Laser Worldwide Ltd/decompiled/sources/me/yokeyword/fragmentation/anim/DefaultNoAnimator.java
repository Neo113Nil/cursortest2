package me.yokeyword.fragmentation.anim;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public class DefaultNoAnimator extends FragmentAnimator {
    public static final Parcelable.Creator<DefaultNoAnimator> CREATOR = new a();

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public DefaultNoAnimator createFromParcel(Parcel parcel) {
            return new DefaultNoAnimator(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public DefaultNoAnimator[] newArray(int i8) {
            return new DefaultNoAnimator[i8];
        }
    }

    public DefaultNoAnimator() {
        this.enter = 0;
        this.exit = 0;
        this.popEnter = 0;
        this.popExit = 0;
    }

    @Override // me.yokeyword.fragmentation.anim.FragmentAnimator, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // me.yokeyword.fragmentation.anim.FragmentAnimator, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
    }

    protected DefaultNoAnimator(Parcel parcel) {
        super(parcel);
    }
}
