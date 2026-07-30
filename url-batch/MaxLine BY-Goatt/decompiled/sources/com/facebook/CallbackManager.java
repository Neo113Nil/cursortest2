package com.facebook;

import android.content.Intent;
import com.facebook.internal.CallbackManagerImpl;
import defpackage.q40;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface CallbackManager {

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class ActivityResultParameters {
        private final Intent data;
        private final int requestCode;
        private final int resultCode;

        public ActivityResultParameters(int i, int i2, Intent intent) {
            this.requestCode = i;
            this.resultCode = i2;
            this.data = intent;
        }

        public static /* synthetic */ ActivityResultParameters copy$default(ActivityResultParameters activityResultParameters, int i, int i2, Intent intent, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = activityResultParameters.requestCode;
            }
            if ((i3 & 2) != 0) {
                i2 = activityResultParameters.resultCode;
            }
            if ((i3 & 4) != 0) {
                intent = activityResultParameters.data;
            }
            return activityResultParameters.copy(i, i2, intent);
        }

        public final int component1() {
            return this.requestCode;
        }

        public final int component2() {
            return this.resultCode;
        }

        public final Intent component3() {
            return this.data;
        }

        public final ActivityResultParameters copy(int i, int i2, Intent intent) {
            return new ActivityResultParameters(i, i2, intent);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActivityResultParameters)) {
                return false;
            }
            ActivityResultParameters activityResultParameters = (ActivityResultParameters) obj;
            return this.requestCode == activityResultParameters.requestCode && this.resultCode == activityResultParameters.resultCode && Intrinsics.b(this.data, activityResultParameters.data);
        }

        public final Intent getData() {
            return this.data;
        }

        public final int getRequestCode() {
            return this.requestCode;
        }

        public final int getResultCode() {
            return this.resultCode;
        }

        public int hashCode() {
            int e = q40.e(this.resultCode, Integer.hashCode(this.requestCode) * 31, 31);
            Intent intent = this.data;
            return e + (intent == null ? 0 : intent.hashCode());
        }

        public String toString() {
            return "ActivityResultParameters(requestCode=" + this.requestCode + ", resultCode=" + this.resultCode + ", data=" + this.data + ')';
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Factory {
        public static final Factory INSTANCE = new Factory();

        private Factory() {
        }

        public static final CallbackManager create() {
            return new CallbackManagerImpl();
        }
    }

    boolean onActivityResult(int i, int i2, Intent intent);
}
