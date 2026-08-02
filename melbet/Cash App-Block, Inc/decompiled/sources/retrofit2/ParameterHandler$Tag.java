package retrofit2;

/* loaded from: classes4.dex */
public final class ParameterHandler$Tag extends Utils {
    public final Class cls;

    public ParameterHandler$Tag(Class cls) {
        this.cls = cls;
    }

    @Override // retrofit2.Utils
    public final void apply(RequestBuilder requestBuilder, Object obj) {
        requestBuilder.requestBuilder.tag(this.cls, obj);
    }
}
