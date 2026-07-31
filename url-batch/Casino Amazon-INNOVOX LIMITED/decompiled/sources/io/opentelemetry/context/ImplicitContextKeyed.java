package io.opentelemetry.context;

/* loaded from: classes3.dex */
public interface ImplicitContextKeyed {
    Context storeInContext(Context context);

    default Scope makeCurrent() {
        return Context.current().with(this).makeCurrent();
    }
}
