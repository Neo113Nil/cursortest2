package S;

/* loaded from: classes.dex */
public abstract class c {
    final String mPropertyName;

    public c(String str) {
        this.mPropertyName = str;
    }

    public abstract float getValue(Object obj);

    public abstract void setValue(Object obj, float f4);
}
