package ru.rustore.sdk.pay.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class y4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f45257a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f45258b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f45259a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f45260b;

        public a(@NotNull String manufacturer, @NotNull String hardware) {
            String model = Build.MODEL;
            String device = Build.DEVICE;
            Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(hardware, "hardware");
            Intrinsics.checkNotNullParameter(device, "device");
            this.f45259a = manufacturer;
            this.f45260b = hardware;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!Intrinsics.areEqual(this.f45259a, aVar.f45259a)) {
                return false;
            }
            String str = Build.MODEL;
            if (!Intrinsics.areEqual(str, str) || !Intrinsics.areEqual(this.f45260b, aVar.f45260b)) {
                return false;
            }
            String str2 = Build.DEVICE;
            return Intrinsics.areEqual(str2, str2);
        }

        public final int hashCode() {
            return Build.DEVICE.hashCode() + j1.a(this.f45260b, j1.a(Build.MODEL, this.f45259a.hashCode() * 31, 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("DeviceIdData(manufacturer=");
            sb.append(this.f45259a);
            sb.append(", model=");
            sb.append(Build.MODEL);
            sb.append(", hardware=");
            sb.append(this.f45260b);
            sb.append(", device=");
            return i1.a(sb, Build.DEVICE, ')');
        }
    }

    public y4(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45257a = context;
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        String HARDWARE = Build.HARDWARE;
        Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
        String DEVICE = Build.DEVICE;
        Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
        this.f45258b = new a(MANUFACTURER, HARDWARE);
    }

    @SuppressLint({"HardwareIds"})
    @NotNull
    public final String a() {
        Object m243constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(Settings.Secure.getString(this.f45257a.getContentResolver(), "android_id"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.d(m243constructorimpl) != null) {
            m243constructorimpl = "";
        }
        String value = ((String) m243constructorimpl) + '-' + this.f45258b.hashCode();
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }
}
