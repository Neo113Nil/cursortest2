package kotlin.sequences;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.collections.immutable.implementations.persistentOrderedSet.Links;

/* loaded from: classes3.dex */
public class GeneratorSequence$iterator$1 implements Iterator, KMappedMarker {
    public final /* synthetic */ int $r8$classId;
    public Object nextItem;
    public int nextState;
    public final Object this$0;

    public GeneratorSequence$iterator$1(Map map, Object obj) {
        this.$r8$classId = 1;
        map.getClass();
        this.nextItem = obj;
        this.this$0 = map;
    }

    public void calcNext$1() {
        Object invoke;
        int i = this.nextState;
        GeneratorSequence generatorSequence = (GeneratorSequence) this.this$0;
        if (i == -2) {
            invoke = generatorSequence.getInitialValue.invoke();
        } else {
            Function1 function1 = generatorSequence.getNextValue;
            Object obj = this.nextItem;
            obj.getClass();
            invoke = function1.invoke(obj);
        }
        this.nextItem = invoke;
        this.nextState = invoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.$r8$classId) {
            case 0:
                if (this.nextState < 0) {
                    calcNext$1();
                }
                return this.nextState == 1;
            default:
                return this.nextState < ((Map) this.this$0).size();
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        Object obj = null;
        switch (this.$r8$classId) {
            case 0:
                if (this.nextState < 0) {
                    calcNext$1();
                }
                if (this.nextState == 0) {
                    a$$ExternalSyntheticBUOutline0.m();
                    return null;
                }
                Object obj2 = this.nextItem;
                obj2.getClass();
                this.nextState = -1;
                return obj2;
            default:
                if (hasNext()) {
                    obj = this.nextItem;
                    this.nextState++;
                    Object obj3 = ((Map) this.this$0).get(obj);
                    if (obj3 == null) {
                        throw new ConcurrentModificationException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Hash code of an element (", ") has changed after it was added to the persistent set.", obj));
                    }
                    this.nextItem = ((Links) obj3).next;
                } else {
                    a$$ExternalSyntheticBUOutline0.m();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public GeneratorSequence$iterator$1(GeneratorSequence generatorSequence) {
        this.$r8$classId = 0;
        this.this$0 = generatorSequence;
        this.nextState = -2;
    }
}
