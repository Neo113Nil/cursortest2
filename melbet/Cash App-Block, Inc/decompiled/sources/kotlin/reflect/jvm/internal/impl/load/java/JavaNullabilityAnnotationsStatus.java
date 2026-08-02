package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.KotlinVersion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class JavaNullabilityAnnotationsStatus {
    public static final Companion Companion = new Companion(null);
    public static final JavaNullabilityAnnotationsStatus DEFAULT = new JavaNullabilityAnnotationsStatus(ReportLevel.STRICT, null, null, 6, null);
    public final ReportLevel reportLevelAfter;
    public final ReportLevel reportLevelBefore;
    public final KotlinVersion sinceVersion;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final JavaNullabilityAnnotationsStatus getDEFAULT() {
            return JavaNullabilityAnnotationsStatus.DEFAULT;
        }
    }

    public /* synthetic */ JavaNullabilityAnnotationsStatus(ReportLevel reportLevel, KotlinVersion kotlinVersion, ReportLevel reportLevel2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i & 2) != 0 ? new KotlinVersion(1, 0) : kotlinVersion, (i & 4) != 0 ? reportLevel : reportLevel2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaNullabilityAnnotationsStatus)) {
            return false;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = (JavaNullabilityAnnotationsStatus) obj;
        return this.reportLevelBefore == javaNullabilityAnnotationsStatus.reportLevelBefore && Intrinsics.areEqual(this.sinceVersion, javaNullabilityAnnotationsStatus.sinceVersion) && this.reportLevelAfter == javaNullabilityAnnotationsStatus.reportLevelAfter;
    }

    public final ReportLevel getReportLevelAfter() {
        return this.reportLevelAfter;
    }

    public final ReportLevel getReportLevelBefore() {
        return this.reportLevelBefore;
    }

    public final KotlinVersion getSinceVersion() {
        return this.sinceVersion;
    }

    public int hashCode() {
        int hashCode = this.reportLevelBefore.hashCode() * 31;
        KotlinVersion kotlinVersion = this.sinceVersion;
        return this.reportLevelAfter.hashCode() + ((hashCode + (kotlinVersion == null ? 0 : kotlinVersion.getVersion())) * 31);
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.reportLevelBefore + ", sinceVersion=" + this.sinceVersion + ", reportLevelAfter=" + this.reportLevelAfter + ')';
    }

    public JavaNullabilityAnnotationsStatus(ReportLevel reportLevel, KotlinVersion kotlinVersion, ReportLevel reportLevel2) {
        reportLevel.getClass();
        reportLevel2.getClass();
        this.reportLevelBefore = reportLevel;
        this.sinceVersion = kotlinVersion;
        this.reportLevelAfter = reportLevel2;
    }
}
