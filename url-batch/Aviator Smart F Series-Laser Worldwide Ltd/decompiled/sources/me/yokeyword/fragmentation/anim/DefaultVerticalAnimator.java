package me.yokeyword.fragmentation.anim;

import android.os.Parcel;
import android.os.Parcelable;
import me.yokeyword.fragmentation.R$anim;

/* loaded from: classes5.dex */
public class DefaultVerticalAnimator extends FragmentAnimator {
    public static final Parcelable.Creator<DefaultVerticalAnimator> CREATOR = new a();

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public DefaultVerticalAnimator createFromParcel(Parcel parcel) {
            return new DefaultVerticalAnimator(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public DefaultVerticalAnimator[] newArray(int i8) {
            return new DefaultVerticalAnimator[i8];
        }
    }

    public DefaultVerticalAnimator() {
        this.enter = R$anim.v_fragment_enter;
        this.exit = R$anim.v_fragment_exit;
        this.popEnter = R$anim.v_fragment_pop_enter;
        this.popExit = R$anim.v_fragment_pop_exit;
    }

    @Override // me.yokeyword.fragmentation.anim.FragmentAnimator, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // me.yokeyword.fragmentation.anim.FragmentAnimator, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
    }

    protected DefaultVerticalAnimator(Parcel parcel) {
        super(parcel);
    }
}
