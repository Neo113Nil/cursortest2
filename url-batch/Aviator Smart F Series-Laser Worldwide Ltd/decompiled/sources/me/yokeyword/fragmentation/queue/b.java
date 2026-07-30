package me.yokeyword.fragmentation.queue;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedList;
import java.util.Queue;
import me.yokeyword.fragmentation.d;
import me.yokeyword.fragmentation.g;

/* loaded from: classes5.dex */
public class b {
    private Handler mMainHandler;
    private Queue<me.yokeyword.fragmentation.queue.a> mQueue = new LinkedList();

    class a implements Runnable {
        final /* synthetic */ me.yokeyword.fragmentation.queue.a val$action;

        a(me.yokeyword.fragmentation.queue.a aVar) {
            this.val$action = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.enqueueAction(this.val$action);
        }
    }

    /* renamed from: me.yokeyword.fragmentation.queue.b$b, reason: collision with other inner class name */
    class RunnableC0375b implements Runnable {
        RunnableC0375b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.mQueue.poll();
            b.this.handleAction();
        }
    }

    public b(Handler handler) {
        this.mMainHandler = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enqueueAction(me.yokeyword.fragmentation.queue.a aVar) {
        this.mQueue.add(aVar);
        if (this.mQueue.size() == 1) {
            handleAction();
        }
    }

    private void executeNextAction(me.yokeyword.fragmentation.queue.a aVar) {
        if (aVar.action == 1) {
            d backStackTopFragment = g.getBackStackTopFragment(aVar.fragmentManager);
            aVar.duration = backStackTopFragment == null ? 300L : backStackTopFragment.getSupportDelegate().getExitAnimDuration();
        }
        this.mMainHandler.postDelayed(new RunnableC0375b(), aVar.duration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAction() {
        if (this.mQueue.isEmpty()) {
            return;
        }
        me.yokeyword.fragmentation.queue.a peek = this.mQueue.peek();
        peek.run();
        executeNextAction(peek);
    }

    private boolean isThrottleBACK(me.yokeyword.fragmentation.queue.a aVar) {
        me.yokeyword.fragmentation.queue.a peek;
        return aVar.action == 3 && (peek = this.mQueue.peek()) != null && peek.action == 1;
    }

    public void enqueue(me.yokeyword.fragmentation.queue.a aVar) {
        if (isThrottleBACK(aVar)) {
            return;
        }
        if (aVar.action == 4 && this.mQueue.isEmpty() && Thread.currentThread() == Looper.getMainLooper().getThread()) {
            aVar.run();
        } else {
            this.mMainHandler.post(new a(aVar));
        }
    }
}
