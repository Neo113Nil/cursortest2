package defpackage;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.bolts.TaskCompletionSource;
import com.facebook.gamingservices.TournamentFetcher;
import com.facebook.gamingservices.TournamentUpdater;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class py2 implements GraphRequest.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ py2(TaskCompletionSource taskCompletionSource, int i) {
        this.a = i;
        this.b = taskCompletionSource;
    }

    @Override // com.facebook.GraphRequest.Callback
    public final void onCompleted(GraphResponse graphResponse) {
        int i = this.a;
        TaskCompletionSource taskCompletionSource = this.b;
        switch (i) {
            case 0:
                TournamentFetcher.fetchTournaments$lambda$1(taskCompletionSource, graphResponse);
                break;
            default:
                TournamentUpdater.update$lambda$0(taskCompletionSource, graphResponse);
                break;
        }
    }
}
