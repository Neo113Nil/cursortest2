package retrofit2;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.TuplesKt;
import okhttp3.Headers;
import okhttp3.RequestBody;

/* loaded from: classes9.dex */
public final class ParameterHandler$Part extends Utils {
    public final /* synthetic */ int $r8$classId = 0;
    public final Converter converter;
    public final Object headers;
    public final Method method;
    public final int p;

    public ParameterHandler$Part(Method method, int i, Headers headers, Converter converter) {
        this.method = method;
        this.p = i;
        this.headers = headers;
        this.converter = converter;
    }

    @Override // retrofit2.Utils
    public final void apply(RequestBuilder requestBuilder, Object obj) {
        int i = this.$r8$classId;
        Converter converter = this.converter;
        Object obj2 = this.headers;
        Method method = this.method;
        int i2 = this.p;
        switch (i) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    RequestBody requestBody = (RequestBody) converter.convert(obj);
                    requestBuilder.multipartBuilder.addPart((Headers) obj2, requestBody);
                    return;
                } catch (IOException e) {
                    throw Utils.parameterError(method, i2, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unable to convert ", " to RequestBody", obj), e);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw Utils.parameterError(method, i2, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw Utils.parameterError(method, i2, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw Utils.parameterError(method, i2, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String[] strArr = {"Content-Disposition", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2};
                    Headers headers = Headers.EMPTY;
                    requestBuilder.multipartBuilder.addPart(TuplesKt.of(strArr), (RequestBody) converter.convert(value));
                }
                return;
        }
    }

    public ParameterHandler$Part(Method method, int i, Converter converter, String str) {
        this.method = method;
        this.p = i;
        this.converter = converter;
        this.headers = str;
    }
}
