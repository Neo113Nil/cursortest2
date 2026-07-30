package me.yokeyword.fragmentation.anim;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.AnimRes;

/* loaded from: classes5.dex */
public class FragmentAnimator implements Parcelable {
    public static final Parcelable.Creator<FragmentAnimator> CREATOR = new a();

    @AnimRes
    protected int enter;

    @AnimRes
    protected int exit;

    @AnimRes
    protected int popEnter;

    @AnimRes
    protected int popExit;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public FragmentAnimator createFromParcel(Parcel parcel) {
            return new FragmentAnimator(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public FragmentAnimator[] newArray(int i8) {
            return new FragmentAnimator[i8];
        }
    }

    public FragmentAnimator() {
    }

    public FragmentAnimator copy() {
        return new FragmentAnimator(getEnter(), getExit(), getPopEnter(), getPopExit());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getEnter() {
        return this.enter;
    }

    public int getExit() {
        return this.exit;
    }

    public int getPopEnter() {
        return this.popEnter;
    }

    public int getPopExit() {
        return this.popExit;
    }

    public FragmentAnimator setEnter(int i8) {
        this.enter = i8;
        return this;
    }

    public FragmentAnimator setExit(int i8) {
        this.exit = i8;
        return this;
    }

    public FragmentAnimator setPopEnter(int i8) {
        this.popEnter = i8;
        return this;
    }

    public FragmentAnimator setPopExit(int i8) {
        this.popExit = i8;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.enter);
        parcel.writeInt(this.exit);
        parcel.writeInt(this.popEnter);
        parcel.writeInt(this.popExit);
    }

    public FragmentAnimator(int i8, int i9) {
        this.enter = i8;
        this.exit = i9;
    }

    public FragmentAnimator(int i8, int i9, int i10, int i11) {
        this.enter = i8;
        this.exit = i9;
        this.popEnter = i10;
        this.popExit = i11;
    }

    protected FragmentAnimator(Parcel parcel) {
        this.enter = parcel.readInt();
        this.exit = parcel.readInt();
        this.popEnter = parcel.readInt();
        this.popExit = parcel.readInt();
    }
}
