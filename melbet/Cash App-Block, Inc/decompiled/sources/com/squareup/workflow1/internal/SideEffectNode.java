package com.squareup.workflow1.internal;

import kotlinx.coroutines.StandaloneCoroutine;

/* loaded from: classes8.dex */
public final class SideEffectNode implements InlineLinkedList$InlineListNode {
    public final StandaloneCoroutine job;
    public final String key;
    public SideEffectNode nextListNode;

    public SideEffectNode(String str, StandaloneCoroutine standaloneCoroutine) {
        str.getClass();
        this.key = str;
        this.job = standaloneCoroutine;
    }

    @Override // com.squareup.workflow1.internal.InlineLinkedList$InlineListNode
    public final InlineLinkedList$InlineListNode getNextListNode() {
        return this.nextListNode;
    }

    @Override // com.squareup.workflow1.internal.InlineLinkedList$InlineListNode
    public final void setNextListNode(InlineLinkedList$InlineListNode inlineLinkedList$InlineListNode) {
        this.nextListNode = (SideEffectNode) inlineLinkedList$InlineListNode;
    }
}
