package androidx.activity;

import android.content.res.Resources;
import androidx.annotation.ColorInt;
import f6.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class SystemBarStyle {
    public static final Companion Companion = new Companion(null);
    private final int darkScrim;
    private final l detectDarkMode;
    private final int lightScrim;
    private final int nightMode;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public static /* synthetic */ SystemBarStyle auto$default(Companion companion, int i8, int i9, l lVar, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                lVar = new l() { // from class: androidx.activity.SystemBarStyle$Companion$auto$1
                    @Override // f6.l
                    public final Boolean invoke(Resources resources) {
                        s.checkNotNullParameter(resources, "resources");
                        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
                    }
                };
            }
            return companion.auto(i8, i9, lVar);
        }

        public final SystemBarStyle auto(@ColorInt int i8, @ColorInt int i9) {
            return auto$default(this, i8, i9, null, 4, null);
        }

        public final SystemBarStyle dark(@ColorInt int i8) {
            return new SystemBarStyle(i8, i8, 2, new l() { // from class: androidx.activity.SystemBarStyle$Companion$dark$1
                @Override // f6.l
                public final Boolean invoke(Resources resources) {
                    s.checkNotNullParameter(resources, "<anonymous parameter 0>");
                    return Boolean.TRUE;
                }
            }, null);
        }

        public final SystemBarStyle light(@ColorInt int i8, @ColorInt int i9) {
            return new SystemBarStyle(i8, i9, 1, new l() { // from class: androidx.activity.SystemBarStyle$Companion$light$1
                @Override // f6.l
                public final Boolean invoke(Resources resources) {
                    s.checkNotNullParameter(resources, "<anonymous parameter 0>");
                    return Boolean.FALSE;
                }
            }, null);
        }

        public final SystemBarStyle auto(@ColorInt int i8, @ColorInt int i9, l detectDarkMode) {
            s.checkNotNullParameter(detectDarkMode, "detectDarkMode");
            return new SystemBarStyle(i8, i9, 0, detectDarkMode, null);
        }
    }

    public /* synthetic */ SystemBarStyle(int i8, int i9, int i10, l lVar, o oVar) {
        this(i8, i9, i10, lVar);
    }

    public static final SystemBarStyle auto(@ColorInt int i8, @ColorInt int i9) {
        return Companion.auto(i8, i9);
    }

    public static final SystemBarStyle dark(@ColorInt int i8) {
        return Companion.dark(i8);
    }

    public static final SystemBarStyle light(@ColorInt int i8, @ColorInt int i9) {
        return Companion.light(i8, i9);
    }

    public final int getDarkScrim$activity_release() {
        return this.darkScrim;
    }

    public final l getDetectDarkMode$activity_release() {
        return this.detectDarkMode;
    }

    public final int getNightMode$activity_release() {
        return this.nightMode;
    }

    public final int getScrim$activity_release(boolean z7) {
        return z7 ? this.darkScrim : this.lightScrim;
    }

    public final int getScrimWithEnforcedContrast$activity_release(boolean z7) {
        if (this.nightMode == 0) {
            return 0;
        }
        return z7 ? this.darkScrim : this.lightScrim;
    }

    private SystemBarStyle(int i8, int i9, int i10, l lVar) {
        this.lightScrim = i8;
        this.darkScrim = i9;
        this.nightMode = i10;
        this.detectDarkMode = lVar;
    }

    public static final SystemBarStyle auto(@ColorInt int i8, @ColorInt int i9, l lVar) {
        return Companion.auto(i8, i9, lVar);
    }
}
