package retrofit2;

import io.noties.markwon.MarkwonImpl;
import java.util.ArrayList;
import okhttp3.MultipartBody;

/* loaded from: classes9.dex */
public final class ParameterHandler$RawPart extends Utils {
    public static final ParameterHandler$RawPart INSTANCE = new ParameterHandler$RawPart();

    @Override // retrofit2.Utils
    public final void apply(RequestBuilder requestBuilder, Object obj) {
        MultipartBody.Part part = (MultipartBody.Part) obj;
        if (part != null) {
            MarkwonImpl markwonImpl = requestBuilder.multipartBuilder;
            markwonImpl.getClass();
            ((ArrayList) markwonImpl.plugins).add(part);
        }
    }
}
