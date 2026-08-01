package na;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {
    private final Map<String, String> idTranslations;
    private final List<g> operations;
    private final b result;
    private final Integer retryAfterSeconds;

    public /* synthetic */ a(b bVar, Map map, List list, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i3 & 2) != 0 ? null : map, (i3 & 4) != 0 ? null : list, (i3 & 8) != 0 ? null : num);
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

    /* JADX WARN: Multi-variable type inference failed */
    public a(b bVar, Map<String, String> map, List<? extends g> list, Integer num) {
        bVar.getClass();
        this.result = bVar;
        this.idTranslations = map;
        this.operations = list;
        this.retryAfterSeconds = num;
    }
}
