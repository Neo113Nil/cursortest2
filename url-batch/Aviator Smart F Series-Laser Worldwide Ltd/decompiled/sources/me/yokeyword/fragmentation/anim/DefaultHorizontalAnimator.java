package me.yokeyword.fragmentation.anim;

import android.os.Parcel;
import android.os.Parcelable;
import me.yokeyword.fragmentation.R$anim;

/* loaded from: classes5.dex */
public class DefaultHorizontalAnimator extends FragmentAnimator {
    public static final Parcelable.Creator<DefaultHorizontalAnimator> CREATOR = new a();

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public DefaultHorizontalAnimator createFromParcel(Parcel parcel) {
            return new DefaultHorizontalAnimator(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public DefaultHorizontalAnimator[] newArray(int i8) {
            return new DefaultHorizontalAnimator[i8];
        }
    }

    public DefaultHorizontalAnimator() {
        this.enter = R$anim.h_fragment_enter;
        this.exit = R$anim.h_fragment_exit;
        this.popEnter = R$anim.h_fragment_pop_enter;
        this.popExit = R$anim.h_fragment_pop_exit;
    }

    @Override // me.yokeyword.fragmentation.anim.FragmentAnimator, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // me.yokeyword.fragmentation.anim.FragmentAnimator, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
    }

    protected DefaultHorizontalAnimator(Parcel parcel) {
        super(parcel);
    }
}
