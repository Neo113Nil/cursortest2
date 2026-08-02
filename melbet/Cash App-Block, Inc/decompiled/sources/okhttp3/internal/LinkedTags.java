package okhttp3.internal;

import kotlin.collections.CollectionsKt;
import kotlin.reflect.KClass;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import okio.internal.ZipFilesKt$$ExternalSyntheticLambda4;
import papa.PapaEvent;

/* loaded from: classes3.dex */
public final class LinkedTags extends Tags {
    public final KClass key;
    public final Tags next;
    public final Object value;

    public LinkedTags(KClass kClass, Object obj, Tags tags) {
        obj.getClass();
        tags.getClass();
        this.key = kClass;
        this.value = obj;
        this.next = tags;
    }

    @Override // okhttp3.internal.Tags
    public final Object get(KClass kClass) {
        kClass.getClass();
        return kClass.equals(this.key) ? PapaEvent.getJavaClass(kClass).cast(this.value) : this.next.get(kClass);
    }

    @Override // okhttp3.internal.Tags
    public final Tags plus(KClass kClass, Object obj) {
        KClass kClass2 = this.key;
        boolean equals = kClass.equals(kClass2);
        Tags tags = this.next;
        if (!equals) {
            Tags plus = tags.plus(kClass, null);
            if (plus != tags) {
                this = new LinkedTags(kClass2, this.value, plus);
            }
            tags = this;
        }
        return obj != null ? new LinkedTags(kClass, obj, tags) : tags;
    }

    public final String toString() {
        return CollectionsKt.joinToString$default(CollectionsKt.reversed(SequencesKt___SequencesKt.toList(SequencesKt__SequencesKt.generateSequence(new ZipFilesKt$$ExternalSyntheticLambda4(1), this))), null, "{", "}", 0, null, new ZipFilesKt$$ExternalSyntheticLambda4(2), 25);
    }
}
