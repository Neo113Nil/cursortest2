package okhttp3;

import java.io.IOException;
import kotlin.Metadata;

@Metadata
/* loaded from: classes3.dex */
public interface Callback {
    void a(Call call, Response response);

    void b(Call call, IOException iOException);
}
