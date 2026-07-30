package io.noties.markwon;

import androidx.annotation.NonNull;
import io.noties.markwon.l;
import org.commonmark.node.u;

/* loaded from: classes4.dex */
public class b implements l.a {
    @Override // io.noties.markwon.l.a
    public void blockEnd(@NonNull l lVar, @NonNull u uVar) {
        if (lVar.hasNext(uVar)) {
            lVar.ensureNewLine();
            lVar.forceNewLine();
        }
    }

    @Override // io.noties.markwon.l.a
    public void blockStart(@NonNull l lVar, @NonNull u uVar) {
        lVar.ensureNewLine();
    }
}
