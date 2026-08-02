package org.intellij.markdown.ast.impl;

import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import net.idrnd.face.iad.capture.internal.e3;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.ast.CompositeASTNode;

/* loaded from: classes9.dex */
public final class ListCompositeNode extends CompositeASTNode {
    public final Lazy loose$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListCompositeNode(MarkdownElementType markdownElementType, ArrayList arrayList) {
        super(arrayList, markdownElementType);
        markdownElementType.getClass();
        this.loose$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new e3(this, 25));
    }
}
