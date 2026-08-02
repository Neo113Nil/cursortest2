package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KotlinKPropertyN$$Lambda$0;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes9.dex */
public final class Jsr305Settings {
    public final Lazy description$delegate;
    public final ReportLevel globalLevel;
    public final boolean isDisabled;
    public final ReportLevel migrationLevel;
    public final Map userDefinedLevelForSpecificAnnotation;

    public Jsr305Settings(ReportLevel reportLevel, ReportLevel reportLevel2, Map<FqName, ? extends ReportLevel> map) {
        reportLevel.getClass();
        map.getClass();
        this.globalLevel = reportLevel;
        this.migrationLevel = reportLevel2;
        this.userDefinedLevelForSpecificAnnotation = map;
        this.description$delegate = LazyKt.lazy(new KotlinKPropertyN$$Lambda$0(this, 13));
        ReportLevel reportLevel3 = ReportLevel.IGNORE;
        this.isDisabled = reportLevel == reportLevel3 && reportLevel2 == reportLevel3 && map.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jsr305Settings)) {
            return false;
        }
        Jsr305Settings jsr305Settings = (Jsr305Settings) obj;
        return this.globalLevel == jsr305Settings.globalLevel && this.migrationLevel == jsr305Settings.migrationLevel && Intrinsics.areEqual(this.userDefinedLevelForSpecificAnnotation, jsr305Settings.userDefinedLevelForSpecificAnnotation);
    }

    public final ReportLevel getGlobalLevel() {
        return this.globalLevel;
    }

    public final ReportLevel getMigrationLevel() {
        return this.migrationLevel;
    }

    public final Map<FqName, ReportLevel> getUserDefinedLevelForSpecificAnnotation() {
        return this.userDefinedLevelForSpecificAnnotation;
    }

    public int hashCode() {
        int hashCode = this.globalLevel.hashCode() * 31;
        ReportLevel reportLevel = this.migrationLevel;
        return this.userDefinedLevelForSpecificAnnotation.hashCode() + ((hashCode + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31);
    }

    public final boolean isDisabled() {
        return this.isDisabled;
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.globalLevel + ", migrationLevel=" + this.migrationLevel + ", userDefinedLevelForSpecificAnnotation=" + this.userDefinedLevelForSpecificAnnotation + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Jsr305Settings(ReportLevel reportLevel, ReportLevel reportLevel2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, reportLevel2, map);
        reportLevel2 = (i & 2) != 0 ? null : reportLevel2;
        if ((i & 4) != 0) {
            map = EmptyMap.INSTANCE;
            map.getClass();
        }
    }
}
