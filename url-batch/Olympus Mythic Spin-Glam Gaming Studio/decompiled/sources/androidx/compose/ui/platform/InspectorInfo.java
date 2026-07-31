package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* compiled from: InspectableValue.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "value", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "Landroidx/compose/ui/platform/ValueElementSequence;", "properties", "Landroidx/compose/ui/platform/ValueElementSequence;", "getProperties", "()Landroidx/compose/ui/platform/ValueElementSequence;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InspectorInfo {
    private String name;
    private final ValueElementSequence properties;
    private Object value;

    public final void setName(String str) {
        this.name = str;
    }

    public final void setValue(Object obj) {
        this.value = obj;
    }

    public final ValueElementSequence getProperties() {
        return this.properties;
    }
}
