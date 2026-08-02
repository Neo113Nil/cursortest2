package kotlin.reflect;

/* loaded from: classes3.dex */
public interface KProperty extends KCallable {

    /* loaded from: classes9.dex */
    public interface Accessor {
        KProperty getProperty();
    }

    /* loaded from: classes9.dex */
    public interface Getter extends Accessor, KFunction {
    }

    Getter getGetter();
}
