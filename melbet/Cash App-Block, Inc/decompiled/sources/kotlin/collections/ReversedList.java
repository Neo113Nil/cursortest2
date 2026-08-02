package kotlin.collections;

import androidx.transition.Transition;
import app.cash.redwood.yoga.Node;
import app.cash.redwood.yoga.internal.YGNode;
import app.cash.redwood.yoga.internal.Yoga;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes9.dex */
public final class ReversedList extends AbstractMutableList {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object delegate;

    public ReversedList(ArrayList arrayList) {
        this.delegate = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.$r8$classId;
        Object obj2 = this.delegate;
        switch (i2) {
            case 0:
                ((ArrayList) obj2).add(CollectionsKt__ReversedViewsKt.access$reversePositionIndex(i, this), obj);
                break;
            default:
                Node node = (Node) obj;
                node.getClass();
                Yoga yoga = Yoga.INSTANCE;
                YGNode yGNode = ((Node) obj2).f60native;
                YGNode yGNode2 = node.f60native;
                yGNode.getClass();
                yGNode2.getClass();
                Yoga.YGAssertWithNode(yGNode, yGNode2.owner == null, "Child already has a owner, it must be removed first.");
                Yoga.YGAssertWithNode(yGNode, !(((Transition.AnonymousClass1) yGNode.measure.b) != null), "Cannot add child: Nodes with measure functions cannot have children.");
                yGNode.children.add(i, yGNode2);
                yGNode2.owner = yGNode;
                yGNode.markDirtyAndPropogate();
                break;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        switch (this.$r8$classId) {
            case 0:
                ((ArrayList) this.delegate).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.$r8$classId) {
            case 1:
                if (obj instanceof Node) {
                    return super.contains((Node) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.$r8$classId;
        Object obj = this.delegate;
        switch (i2) {
            case 0:
                return ((ArrayList) obj).get(CollectionsKt__ReversedViewsKt.access$reverseElementIndex(i, this));
            default:
                return new Node((YGNode) ((Node) obj).f60native.children.get(i));
        }
    }

    @Override // kotlin.collections.AbstractMutableList
    public final int getSize() {
        int i = this.$r8$classId;
        Object obj = this.delegate;
        switch (i) {
            case 0:
                return ((ArrayList) obj).size();
            default:
                return ((Node) obj).f60native.children.size();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.$r8$classId) {
            case 1:
                if (obj instanceof Node) {
                    return super.indexOf((Node) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.$r8$classId) {
            case 0:
                return new ReversedList$listIterator$1(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.$r8$classId) {
            case 1:
                if (obj instanceof Node) {
                    return super.lastIndexOf((Node) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        switch (this.$r8$classId) {
            case 0:
                return new ReversedList$listIterator$1(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ boolean remove(Object obj) {
        switch (this.$r8$classId) {
            case 1:
                if (obj instanceof Node) {
                    return super.remove((Node) obj);
                }
                return false;
            default:
                return super.remove(obj);
        }
    }

    @Override // kotlin.collections.AbstractMutableList
    public final Object removeAt(int i) {
        int i2 = this.$r8$classId;
        Object obj = this.delegate;
        switch (i2) {
            case 0:
                return ((ArrayList) obj).remove(CollectionsKt__ReversedViewsKt.access$reverseElementIndex(i, this));
            default:
                YGNode yGNode = ((Node) obj).f60native;
                YGNode yGNode2 = (YGNode) yGNode.children.get(i);
                Yoga yoga = Yoga.INSTANCE;
                yGNode.getClass();
                yGNode2.getClass();
                if (yGNode.children.size() != 0) {
                    YGNode yGNode3 = yGNode2.owner;
                    if (yGNode.children.remove(yGNode2)) {
                        if (yGNode == yGNode3) {
                            yGNode2.layout = null;
                            yGNode2.owner = null;
                        }
                        yGNode.markDirtyAndPropogate();
                    }
                }
                return new Node(yGNode2);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.$r8$classId;
        Object obj2 = this.delegate;
        switch (i2) {
            case 0:
                return ((ArrayList) obj2).set(CollectionsKt__ReversedViewsKt.access$reverseElementIndex(i, this), obj);
            default:
                Node node = (Node) obj;
                node.getClass();
                YGNode yGNode = ((Node) obj2).f60native;
                YGNode yGNode2 = (YGNode) yGNode.children.get(i);
                Yoga yoga = Yoga.INSTANCE;
                YGNode yGNode3 = node.f60native;
                yGNode.getClass();
                yGNode3.getClass();
                yGNode.children.set(i, yGNode3);
                yGNode3.owner = yGNode;
                return new Node(yGNode2);
        }
    }

    public ReversedList(Node node) {
        this.delegate = node;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.$r8$classId) {
            case 0:
                return new ReversedList$listIterator$1(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
