package androidx.activity;

import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EdgeToEdge.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B3\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u0015\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0012J\u0015\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0014R\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u0016"}, d2 = {"Landroidx/activity/SystemBarStyle;", "", "lightScrim", "", "darkScrim", "nightMode", "detectDarkMode", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "(IIILkotlin/jvm/functions/Function1;)V", "getDarkScrim$activity_release", "()I", "getDetectDarkMode$activity_release", "()Lkotlin/jvm/functions/Function1;", "getNightMode$activity_release", "getScrim", "isDark", "getScrim$activity_release", "getScrimWithEnforcedContrast", "getScrimWithEnforcedContrast$activity_release", "Companion", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SystemBarStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int darkScrim;
    private final Function1 detectDarkMode;
    private final int lightScrim;
    private final int nightMode;

    public /* synthetic */ SystemBarStyle(int i, int i2, int i3, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, function1);
    }

    private SystemBarStyle(int i, int i2, int i3, Function1 function1) {
        this.lightScrim = i;
        this.darkScrim = i2;
        this.nightMode = i3;
        this.detectDarkMode = function1;
    }

    /* renamed from: getDarkScrim$activity_release, reason: from getter */
    public final int getDarkScrim() {
        return this.darkScrim;
    }

    /* renamed from: getNightMode$activity_release, reason: from getter */
    public final int getNightMode() {
        return this.nightMode;
    }

    /* renamed from: getDetectDarkMode$activity_release, reason: from getter */
    public final Function1 getDetectDarkMode() {
        return this.detectDarkMode;
    }

    /* compiled from: EdgeToEdge.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/activity/SystemBarStyle$Companion;", "", "<init>", "()V", "", "lightScrim", "darkScrim", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "detectDarkMode", "Landroidx/activity/SystemBarStyle;", "auto", "(IILkotlin/jvm/functions/Function1;)Landroidx/activity/SystemBarStyle;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ SystemBarStyle auto$default(Companion companion, int i, int i2, Function1 function1, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                function1 = new Function1() { // from class: androidx.activity.SystemBarStyle$Companion$auto$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(Resources resources) {
                        Intrinsics.checkNotNullParameter(resources, "resources");
                        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
                    }
                };
            }
            return companion.auto(i, i2, function1);
        }

        public final SystemBarStyle auto(int lightScrim, int darkScrim, Function1 detectDarkMode) {
            Intrinsics.checkNotNullParameter(detectDarkMode, "detectDarkMode");
            return new SystemBarStyle(lightScrim, darkScrim, 0, detectDarkMode, null);
        }
    }

    public final int getScrim$activity_release(boolean isDark) {
        return isDark ? this.darkScrim : this.lightScrim;
    }

    public final int getScrimWithEnforcedContrast$activity_release(boolean isDark) {
        if (this.nightMode == 0) {
            return 0;
        }
        if (isDark) {
            return this.darkScrim;
        }
        return this.lightScrim;
    }
}
