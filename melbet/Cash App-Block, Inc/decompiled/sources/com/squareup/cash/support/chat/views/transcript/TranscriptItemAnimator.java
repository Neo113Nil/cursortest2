package com.squareup.cash.support.chat.views.transcript;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class TranscriptItemAnimator extends DefaultItemAnimator {
    public final ArrayList pendingAdds;
    public final ArrayList pendingRemoves;
    public final ArrayList runningAdds;
    public final ArrayList runningRemoves;

    public TranscriptItemAnimator() {
        this.mSupportsChangeAnimations = false;
        this.pendingAdds = new ArrayList();
        this.runningAdds = new ArrayList();
        this.pendingRemoves = new ArrayList();
        this.runningRemoves = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void endAnimation(RecyclerView.ViewHolder viewHolder) {
        viewHolder.getClass();
        ArrayList arrayList = this.pendingAdds;
        if (arrayList.contains(viewHolder)) {
            dispatchAnimationFinished(viewHolder);
            arrayList.remove(viewHolder);
        }
        ArrayList arrayList2 = this.runningAdds;
        if (arrayList2.contains(viewHolder)) {
            arrayList2.remove(viewHolder);
        }
        ArrayList arrayList3 = this.pendingRemoves;
        if (arrayList3.contains(viewHolder)) {
            viewHolder.itemView.setTranslationY(r1.getHeight());
            dispatchAnimationFinished(viewHolder);
            arrayList3.remove(viewHolder);
        }
        ArrayList arrayList4 = this.runningRemoves;
        if (arrayList4.contains(viewHolder)) {
            viewHolder.itemView.animate().cancel();
            arrayList4.remove(viewHolder);
        }
        super.endAnimation(viewHolder);
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void endAnimations() {
        ArrayList arrayList = this.pendingAdds;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) it.next();
            dispatchAnimationFinished(viewHolder);
            arrayList.remove(viewHolder);
        }
        ArrayList arrayList2 = this.runningAdds;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList2.remove((RecyclerView.ViewHolder) it2.next());
        }
        ArrayList arrayList3 = this.pendingRemoves;
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) it3.next();
            viewHolder2.itemView.setTranslationY(r3.getHeight());
            dispatchAnimationFinished(viewHolder2);
            arrayList3.remove(viewHolder2);
        }
        ArrayList arrayList4 = this.runningRemoves;
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            RecyclerView.ViewHolder viewHolder3 = (RecyclerView.ViewHolder) it4.next();
            viewHolder3.itemView.animate().cancel();
            arrayList4.remove(viewHolder3);
        }
        super.endAnimations();
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean isRunning() {
        return (this.pendingAdds.isEmpty() && this.runningAdds.isEmpty() && this.pendingRemoves.isEmpty() && this.runningRemoves.isEmpty() && !super.isRunning()) ? false : true;
    }
}
