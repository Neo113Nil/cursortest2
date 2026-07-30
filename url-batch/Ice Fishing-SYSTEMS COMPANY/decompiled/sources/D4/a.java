package D4;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class a {
    private final Map<String, String> idTranslations;
    private final List<g> operations;
    private final b result;
    private final Integer retryAfterSeconds;

    /* JADX WARN: Multi-variable type inference failed */
    public a(b result, Map<String, String> map, List<? extends g> list, Integer num) {
        h.e(result, "result");
        this.result = result;
        this.idTranslations = map;
        this.operations = list;
        this.retryAfterSeconds = num;
    }

    public final Map<String, String> getIdTranslations() {
        return this.idTranslations;
    }

    public final List<g> getOperations() {
        return this.operations;
    }

    public final b getResult() {
        return this.result;
    }

    public final Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    public /* synthetic */ a(b bVar, Map map, List list, Integer num, int i, kotlin.jvm.internal.e eVar) {
        this(bVar, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : num);
    }
}
