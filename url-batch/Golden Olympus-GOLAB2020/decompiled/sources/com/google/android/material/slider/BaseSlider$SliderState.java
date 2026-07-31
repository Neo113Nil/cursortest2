package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
class BaseSlider$SliderState extends View.BaseSavedState {
    public static final Parcelable.Creator<BaseSlider$SliderState> CREATOR = new Parcelable.Creator<BaseSlider$SliderState>() { // from class: com.google.android.material.slider.BaseSlider$SliderState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BaseSlider$SliderState createFromParcel(Parcel parcel) {
            return new BaseSlider$SliderState(parcel, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BaseSlider$SliderState[] newArray(int i4) {
            return new BaseSlider$SliderState[i4];
        }
    };
    boolean hasFocus;
    float stepSize;
    float valueFrom;
    float valueTo;
    ArrayList<Float> values;

    /* synthetic */ BaseSlider$SliderState(Parcel parcel, BaseSlider$1 baseSlider$1) {
        this(parcel);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeFloat(this.valueFrom);
        parcel.writeFloat(this.valueTo);
        parcel.writeList(this.values);
        parcel.writeFloat(this.stepSize);
        parcel.writeBooleanArray(new boolean[]{this.hasFocus});
    }

    private BaseSlider$SliderState(Parcel parcel) {
        super(parcel);
        this.valueFrom = parcel.readFloat();
        this.valueTo = parcel.readFloat();
        ArrayList<Float> arrayList = new ArrayList<>();
        this.values = arrayList;
        parcel.readList(arrayList, Float.class.getClassLoader());
        this.stepSize = parcel.readFloat();
        this.hasFocus = parcel.createBooleanArray()[0];
    }
}
