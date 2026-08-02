package okhttp3;

/* loaded from: classes3.dex */
public interface Call extends Cloneable {

    public interface Factory {
        Call newCall(Request request);
    }
}
