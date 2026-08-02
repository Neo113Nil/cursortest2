package okio;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class PriorityQueue {

    /* renamed from: array, reason: collision with root package name */
    public Object f1547array;
    public int size;

    public PriorityQueue(TrieNode trieNode, int i) {
        this.f1547array = trieNode;
        this.size = i;
    }

    public void heapifyUp(int i, AsyncTimeout asyncTimeout) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            AsyncTimeout asyncTimeout2 = ((AsyncTimeout[]) this.f1547array)[i2];
            asyncTimeout2.getClass();
            if (Intrinsics.compare(0L, asyncTimeout.timeoutAt - asyncTimeout2.timeoutAt) <= 0) {
                break;
            }
            asyncTimeout2.index = i;
            ((AsyncTimeout[]) this.f1547array)[i] = asyncTimeout2;
            i = i2;
        }
        ((AsyncTimeout[]) this.f1547array)[i] = asyncTimeout;
        asyncTimeout.index = i;
    }

    public void remove(AsyncTimeout asyncTimeout) {
        AsyncTimeout asyncTimeout2;
        int i = asyncTimeout.index;
        if (i == -1) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return;
        }
        int i2 = this.size;
        AsyncTimeout asyncTimeout3 = ((AsyncTimeout[]) this.f1547array)[i2];
        asyncTimeout3.getClass();
        asyncTimeout.index = -1;
        ((AsyncTimeout[]) this.f1547array)[i2] = null;
        this.size = i2 - 1;
        if (asyncTimeout == asyncTimeout3) {
            return;
        }
        int compare = Intrinsics.compare(0L, asyncTimeout3.timeoutAt - asyncTimeout.timeoutAt);
        if (compare == 0) {
            ((AsyncTimeout[]) this.f1547array)[i] = asyncTimeout3;
            asyncTimeout3.index = i;
            return;
        }
        if (compare >= 0) {
            heapifyUp(i, asyncTimeout3);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.size;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                asyncTimeout2 = ((AsyncTimeout[]) this.f1547array)[i3];
                asyncTimeout2.getClass();
            } else {
                asyncTimeout2 = ((AsyncTimeout[]) this.f1547array)[i3];
                asyncTimeout2.getClass();
                AsyncTimeout asyncTimeout4 = ((AsyncTimeout[]) this.f1547array)[i4];
                asyncTimeout4.getClass();
                if (Intrinsics.compare(0L, asyncTimeout4.timeoutAt - asyncTimeout2.timeoutAt) >= 0) {
                    asyncTimeout2 = asyncTimeout4;
                }
            }
            if (Intrinsics.compare(0L, asyncTimeout2.timeoutAt - asyncTimeout3.timeoutAt) <= 0) {
                break;
            }
            int i6 = asyncTimeout2.index;
            asyncTimeout2.index = i;
            ((AsyncTimeout[]) this.f1547array)[i] = asyncTimeout2;
            i = i6;
        }
        ((AsyncTimeout[]) this.f1547array)[i] = asyncTimeout3;
        asyncTimeout3.index = i;
    }
}
