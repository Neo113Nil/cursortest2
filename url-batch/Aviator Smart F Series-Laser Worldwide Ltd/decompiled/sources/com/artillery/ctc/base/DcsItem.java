package com.artillery.ctc.base;

import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class DcsItem {
    private final DirectivePayload directive;

    public DcsItem(DirectivePayload directive) {
        s.checkNotNullParameter(directive, "directive");
        this.directive = directive;
    }

    public static /* synthetic */ DcsItem copy$default(DcsItem dcsItem, DirectivePayload directivePayload, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            directivePayload = dcsItem.directive;
        }
        return dcsItem.copy(directivePayload);
    }

    public final DirectivePayload component1() {
        return this.directive;
    }

    public final DcsItem copy(DirectivePayload directive) {
        s.checkNotNullParameter(directive, "directive");
        return new DcsItem(directive);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DcsItem) && s.areEqual(this.directive, ((DcsItem) obj).directive);
    }

    public final DirectivePayload getDirective() {
        return this.directive;
    }

    public int hashCode() {
        return this.directive.hashCode();
    }

    public String toString() {
        return "DcsItem(directive=" + this.directive + ')';
    }
}
