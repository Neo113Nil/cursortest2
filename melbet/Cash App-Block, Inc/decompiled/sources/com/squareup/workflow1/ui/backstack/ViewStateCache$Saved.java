package com.squareup.workflow1.ui.backstack;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes9.dex */
public final class ViewStateCache$Saved implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR();
    public final Map viewStates;

    public final class CREATOR implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ViewStateCache$Saved(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ViewStateCache$Saved[i];
        }
    }

    public ViewStateCache$Saved(Parcel parcel) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        parcel.readMap(TypeIntrinsics.asMutableMap(linkedHashMap), Recorder.AnonymousClass4.class.getClassLoader());
        this.viewStates = MapsKt__MapsKt.toMap(linkedHashMap);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeMap(this.viewStates);
    }

    public ViewStateCache$Saved(Recorder.AnonymousClass4 anonymousClass4) {
        anonymousClass4.getClass();
        this.viewStates = MapsKt__MapsKt.toMap((LinkedHashMap) anonymousClass4.val$audioErrorConsumer);
    }
}
