package cn.hutool.core.collection;

import java.util.NoSuchElementException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes.dex */
public class o0 implements s0 {
    private int index = 0;
    private final NodeList nodeList;

    public o0(NodeList nodeList) {
        this.nodeList = (NodeList) cn.hutool.core.lang.q.notNull(nodeList, "NodeList must not be null.", new Object[0]);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        NodeList nodeList = this.nodeList;
        return nodeList != null && this.index < nodeList.getLength();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() method not supported for a NodeListIterator.");
    }

    @Override // cn.hutool.core.collection.s0
    public void reset() {
        this.index = 0;
    }

    @Override // java.util.Iterator
    public Node next() {
        NodeList nodeList = this.nodeList;
        if (nodeList == null || this.index >= nodeList.getLength()) {
            throw new NoSuchElementException("underlying nodeList has no more elements");
        }
        NodeList nodeList2 = this.nodeList;
        int i8 = this.index;
        this.index = i8 + 1;
        return nodeList2.item(i8);
    }
}
