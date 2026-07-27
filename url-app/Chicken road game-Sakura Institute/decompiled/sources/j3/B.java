package j3;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
/* loaded from: classes.dex */
public abstract class B extends m {
    public static final A Companion = new A();

    public /* synthetic */ B(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getContent();

    public abstract boolean isString();

    public String toString() {
        return getContent();
    }

    private B() {
        super(null);
    }
}
