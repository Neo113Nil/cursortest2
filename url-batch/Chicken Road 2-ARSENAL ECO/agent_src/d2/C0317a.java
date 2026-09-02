package d2;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;

/* renamed from: d2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0317a {
    private final Map<String, String> idTranslations;
    private final List<g> operations;
    private final b result;
    private final Integer retryAfterSeconds;

    /* JADX WARN: Multi-variable type inference failed */
    public C0317a(b result, Map<String, String> map, List<? extends g> list, Integer num) {
        i.e(result, "result");
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

    public /* synthetic */ C0317a(b bVar, Map map, List list, Integer num, int i7, kotlin.jvm.internal.e eVar) {
        this(bVar, (i7 & 2) != 0 ? null : map, (i7 & 4) != 0 ? null : list, (i7 & 8) != 0 ? null : num);
    }
}
