package com.squareup.cash.treehouse.errorreporter;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.support.views.article.ArticleViewKt$$ExternalSyntheticLambda7;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes7.dex */
public final class ErrorReport {
    public static final Lazy[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final Map customAttributes;
    public final boolean fatal;
    public final String groupingDescriptor;
    public final String message;
    public final String owner;
    public final Throwable throwable;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/errorreporter/ErrorReport$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/errorreporter/ErrorReport;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return ErrorReport$$serializer.INSTANCE;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ArticleViewKt$$ExternalSyntheticLambda7(28)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ArticleViewKt$$ExternalSyntheticLambda7(29))};
    }

    public /* synthetic */ ErrorReport(int i, boolean z, String str, String str2, String str3, Map map, Throwable th) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, ErrorReport$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.fatal = z;
        this.message = str;
        if ((i & 4) == 0) {
            this.owner = null;
        } else {
            this.owner = str2;
        }
        if ((i & 8) == 0) {
            this.groupingDescriptor = null;
        } else {
            this.groupingDescriptor = str3;
        }
        if ((i & 16) == 0) {
            this.customAttributes = null;
        } else {
            this.customAttributes = map;
        }
        if ((i & 32) == 0) {
            this.throwable = null;
        } else {
            this.throwable = th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorReport)) {
            return false;
        }
        ErrorReport errorReport = (ErrorReport) obj;
        return this.fatal == errorReport.fatal && Intrinsics.areEqual(this.message, errorReport.message) && Intrinsics.areEqual(this.owner, errorReport.owner) && Intrinsics.areEqual(this.groupingDescriptor, errorReport.groupingDescriptor) && Intrinsics.areEqual(this.customAttributes, errorReport.customAttributes) && Intrinsics.areEqual(this.throwable, errorReport.throwable);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.fatal) * 31, 31, this.message);
        String str = this.owner;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.groupingDescriptor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map map = this.customAttributes;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Throwable th = this.throwable;
        return hashCode3 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("ErrorReport(fatal=", ", message=", this.message, ", owner=", this.fatal);
        Boxes$$ExternalSyntheticOutline1.m(m, this.owner, ", groupingDescriptor=", this.groupingDescriptor, ", customAttributes=");
        m.append(this.customAttributes);
        m.append(", throwable=");
        m.append(this.throwable);
        m.append(")");
        return m.toString();
    }
}
