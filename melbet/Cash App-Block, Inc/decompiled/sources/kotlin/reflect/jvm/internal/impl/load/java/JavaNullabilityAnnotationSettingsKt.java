package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes9.dex */
public final class JavaNullabilityAnnotationSettingsKt {
    public static final FqName JSPECIFY_ANNOTATIONS_PACKAGE;
    public static final JavaNullabilityAnnotationsStatus JSR_305_DEFAULT_SETTINGS;
    public static final NullabilityAnnotationStatesImpl NULLABILITY_ANNOTATION_SETTINGS;
    public static final FqName[] RXJAVA3_ANNOTATIONS;

    static {
        FqName fqName = new FqName("org.jspecify.nullness");
        FqName fqName2 = new FqName("org.jspecify.annotations");
        JSPECIFY_ANNOTATIONS_PACKAGE = fqName2;
        FqName fqName3 = new FqName("io.reactivex.rxjava3.annotations");
        FqName fqName4 = new FqName("org.checkerframework.checker.nullness.compatqual");
        String asString = fqName3.asString();
        RXJAVA3_ANNOTATIONS = new FqName[]{new FqName(Recorder$$ExternalSyntheticOutline2.m$1(asString, ".Nullable")), new FqName(Recorder$$ExternalSyntheticOutline2.m$1(asString, ".NonNull"))};
        FqName fqName5 = new FqName("org.jetbrains.annotations");
        JavaNullabilityAnnotationsStatus.Companion companion = JavaNullabilityAnnotationsStatus.Companion;
        Pair pair = new Pair(fqName5, companion.getDEFAULT());
        Pair pair2 = new Pair(new FqName("kotlin.annotations.jvm"), companion.getDEFAULT());
        Pair pair3 = new Pair(new FqName("androidx.annotation"), companion.getDEFAULT());
        Pair pair4 = new Pair(new FqName("android.support.annotation"), companion.getDEFAULT());
        Pair pair5 = new Pair(new FqName("android.annotation"), companion.getDEFAULT());
        Pair pair6 = new Pair(new FqName("com.android.annotations"), companion.getDEFAULT());
        Pair pair7 = new Pair(new FqName("org.eclipse.jdt.annotation"), companion.getDEFAULT());
        Pair pair8 = new Pair(new FqName("org.checkerframework.checker.nullness.qual"), companion.getDEFAULT());
        Pair pair9 = new Pair(fqName4, companion.getDEFAULT());
        Pair pair10 = new Pair(new FqName("javax.annotation"), companion.getDEFAULT());
        Pair pair11 = new Pair(new FqName("edu.umd.cs.findbugs.annotations"), companion.getDEFAULT());
        Pair pair12 = new Pair(new FqName("io.reactivex.annotations"), companion.getDEFAULT());
        FqName fqName6 = new FqName("androidx.annotation.RecentlyNullable");
        ReportLevel reportLevel = ReportLevel.WARN;
        Pair pair13 = new Pair(fqName6, new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null));
        Pair pair14 = new Pair(new FqName("androidx.annotation.RecentlyNonNull"), new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null));
        Pair pair15 = new Pair(new FqName("lombok"), companion.getDEFAULT());
        KotlinVersion kotlinVersion = new KotlinVersion(2, 1);
        ReportLevel reportLevel2 = ReportLevel.STRICT;
        NULLABILITY_ANNOTATION_SETTINGS = new NullabilityAnnotationStatesImpl(MapsKt__MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, new Pair(fqName, new JavaNullabilityAnnotationsStatus(reportLevel, kotlinVersion, reportLevel2)), new Pair(fqName2, new JavaNullabilityAnnotationsStatus(reportLevel, new KotlinVersion(2, 1), reportLevel2)), new Pair(fqName3, new JavaNullabilityAnnotationsStatus(reportLevel, new KotlinVersion(1, 8), reportLevel2)), new Pair(new FqName("jakarta.annotation"), new JavaNullabilityAnnotationsStatus(reportLevel, new KotlinVersion(2, 4), reportLevel2)), new Pair(JvmAnnotationNames.JETBRAINS_UNMODIFIABLE_ANNOTATION, new JavaNullabilityAnnotationsStatus(reportLevel, new KotlinVersion(2, 5), reportLevel2)), new Pair(JvmAnnotationNames.JETBRAINS_UNMODIFIABLE_VIEW_ANNOTATION, new JavaNullabilityAnnotationsStatus(reportLevel, new KotlinVersion(2, 5), reportLevel2)), new Pair(new FqName("io.vertx.codegen.annotations"), new JavaNullabilityAnnotationsStatus(reportLevel, new KotlinVersion(2, 5), reportLevel2))));
        JSR_305_DEFAULT_SETTINGS = new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null);
    }

    public static final Jsr305Settings getDefaultJsr305Settings(KotlinVersion kotlinVersion) {
        kotlinVersion.getClass();
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = JSR_305_DEFAULT_SETTINGS;
        ReportLevel reportLevelBefore = (javaNullabilityAnnotationsStatus.getSinceVersion() == null || javaNullabilityAnnotationsStatus.getSinceVersion().compareTo(kotlinVersion) > 0) ? javaNullabilityAnnotationsStatus.getReportLevelBefore() : javaNullabilityAnnotationsStatus.getReportLevelAfter();
        return new Jsr305Settings(reportLevelBefore, getDefaultMigrationJsr305ReportLevelForGivenGlobal(reportLevelBefore), null, 4, null);
    }

    public static final ReportLevel getDefaultMigrationJsr305ReportLevelForGivenGlobal(ReportLevel reportLevel) {
        reportLevel.getClass();
        if (reportLevel == ReportLevel.WARN) {
            return null;
        }
        return reportLevel;
    }

    public static final ReportLevel getDefaultReportLevelForAnnotation(FqName fqName, KotlinVersion kotlinVersion) {
        fqName.getClass();
        kotlinVersion.getClass();
        return getReportLevelForAnnotation(fqName, NullabilityAnnotationStates.Companion.getEMPTY(), kotlinVersion);
    }

    public static final FqName getJSPECIFY_ANNOTATIONS_PACKAGE() {
        return JSPECIFY_ANNOTATIONS_PACKAGE;
    }

    public static final FqName[] getRXJAVA3_ANNOTATIONS() {
        return RXJAVA3_ANNOTATIONS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ReportLevel getReportLevelForAnnotation(FqName fqName, NullabilityAnnotationStates<? extends ReportLevel> nullabilityAnnotationStates, KotlinVersion kotlinVersion) {
        fqName.getClass();
        nullabilityAnnotationStates.getClass();
        kotlinVersion.getClass();
        ReportLevel reportLevel = nullabilityAnnotationStates.get(fqName);
        if (reportLevel != null) {
            return reportLevel;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = (JavaNullabilityAnnotationsStatus) NULLABILITY_ANNOTATION_SETTINGS.get(fqName);
        return javaNullabilityAnnotationsStatus == null ? ReportLevel.IGNORE : (javaNullabilityAnnotationsStatus.getSinceVersion() == null || javaNullabilityAnnotationsStatus.getSinceVersion().compareTo(kotlinVersion) > 0) ? javaNullabilityAnnotationsStatus.getReportLevelBefore() : javaNullabilityAnnotationsStatus.getReportLevelAfter();
    }
}
