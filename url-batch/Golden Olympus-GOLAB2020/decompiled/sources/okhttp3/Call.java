package okhttp3;

import kotlin.Metadata;

@Metadata
/* loaded from: classes3.dex */
public interface Call extends Cloneable {

    @Metadata
    public interface Factory {
        Call a(Request request);
    }

    void cancel();

    Response execute();
}
