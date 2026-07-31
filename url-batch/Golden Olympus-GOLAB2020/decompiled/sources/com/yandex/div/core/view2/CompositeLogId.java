package com.yandex.div.core.view2;

import W1.h;
import W1.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class CompositeLogId {

    @NotNull
    private final String actionLogId;

    @NotNull
    private final h compositeLogId$delegate;

    @NotNull
    private final String dataTag;

    @NotNull
    private final String scopeLogId;

    public CompositeLogId(@NotNull String dataTag, @NotNull String scopeLogId, @NotNull String actionLogId) {
        Intrinsics.checkNotNullParameter(dataTag, "dataTag");
        Intrinsics.checkNotNullParameter(scopeLogId, "scopeLogId");
        Intrinsics.checkNotNullParameter(actionLogId, "actionLogId");
        this.dataTag = dataTag;
        this.scopeLogId = scopeLogId;
        this.actionLogId = actionLogId;
        this.compositeLogId$delegate = i.b(new CompositeLogId$compositeLogId$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatCompositeLogId() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.dataTag);
        if (this.scopeLogId.length() > 0) {
            str = '#' + this.scopeLogId;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append('#');
        sb.append(this.actionLogId);
        return sb.toString();
    }

    private final String getCompositeLogId() {
        return (String) this.compositeLogId$delegate.getValue();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeLogId)) {
            return false;
        }
        CompositeLogId compositeLogId = (CompositeLogId) obj;
        return Intrinsics.areEqual(this.dataTag, compositeLogId.dataTag) && Intrinsics.areEqual(this.scopeLogId, compositeLogId.scopeLogId) && Intrinsics.areEqual(this.actionLogId, compositeLogId.actionLogId);
    }

    @NotNull
    public final String getDataTag() {
        return this.dataTag;
    }

    public int hashCode() {
        return (((this.dataTag.hashCode() * 31) + this.scopeLogId.hashCode()) * 31) + this.actionLogId.hashCode();
    }

    @NotNull
    public String toString() {
        return getCompositeLogId();
    }
}
