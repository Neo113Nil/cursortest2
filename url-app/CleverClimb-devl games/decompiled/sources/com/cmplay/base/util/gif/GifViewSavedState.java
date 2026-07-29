package com.cmplay.base.util.gif;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
class GifViewSavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<GifViewSavedState> CREATOR = new Parcelable.Creator<GifViewSavedState>() { // from class: com.cmplay.base.util.gif.GifViewSavedState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GifViewSavedState createFromParcel(Parcel parcel) {
            return new GifViewSavedState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GifViewSavedState[] newArray(int i) {
            return new GifViewSavedState[i];
        }
    };
    final long[][] mStates;

    GifViewSavedState(Parcelable parcelable, Drawable... drawableArr) {
        super(parcelable);
        this.mStates = new long[drawableArr.length][];
        for (int i = 0; i < drawableArr.length; i++) {
            Drawable drawable = drawableArr[i];
            if (drawable instanceof GifDrawable) {
                this.mStates[i] = ((GifDrawable) drawable).mNativeInfoHandle.getSavedState();
            } else {
                this.mStates[i] = null;
            }
        }
    }

    private GifViewSavedState(Parcel parcel) {
        super(parcel);
        this.mStates = new long[parcel.readInt()][];
        for (int i = 0; i < this.mStates.length; i++) {
            this.mStates[i] = parcel.createLongArray();
        }
    }

    GifViewSavedState(Parcelable parcelable, long[] jArr) {
        super(parcelable);
        this.mStates = new long[1][];
        this.mStates[0] = jArr;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.mStates.length);
        for (long[] jArr : this.mStates) {
            parcel.writeLongArray(jArr);
        }
    }

    void restoreState(Drawable drawable, int i) {
        if (this.mStates[i] == null || !(drawable instanceof GifDrawable)) {
            return;
        }
        ((GifDrawable) drawable).startAnimation(r3.mNativeInfoHandle.restoreSavedState(this.mStates[i], r3.mBuffer));
    }
}
