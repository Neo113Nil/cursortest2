package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.KotlinVersion;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2;

/* loaded from: classes9.dex */
public final class JavaTypeEnhancementState {
    public static final Companion Companion = new Companion(null);
    public final boolean disabledDefaultAnnotations;
    public final Function1 getReportLevelForAnnotation;
    public final Jsr305Settings jsr305;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final JavaTypeEnhancementState getDefault(KotlinVersion kotlinVersion) {
            kotlinVersion.getClass();
            return new JavaTypeEnhancementState(JavaNullabilityAnnotationSettingsKt.getDefaultJsr305Settings(kotlinVersion), new TasksKt$awaitImpl$2$2(kotlinVersion, 5));
        }
    }

    public JavaTypeEnhancementState(Jsr305Settings jsr305Settings, Function1<? super FqName, ? extends ReportLevel> function1) {
        jsr305Settings.getClass();
        function1.getClass();
        this.jsr305 = jsr305Settings;
        this.getReportLevelForAnnotation = function1;
        this.disabledDefaultAnnotations = jsr305Settings.isDisabled() || function1.invoke(JavaNullabilityAnnotationSettingsKt.getJSPECIFY_ANNOTATIONS_PACKAGE()) == ReportLevel.IGNORE;
    }

    public final boolean getDisabledDefaultAnnotations() {
        return this.disabledDefaultAnnotations;
    }

    public final Function1<FqName, ReportLevel> getGetReportLevelForAnnotation() {
        return this.getReportLevelForAnnotation;
    }

    public final Jsr305Settings getJsr305() {
        return this.jsr305;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.jsr305 + ", getReportLevelForAnnotation=" + this.getReportLevelForAnnotation + ')';
    }
}
