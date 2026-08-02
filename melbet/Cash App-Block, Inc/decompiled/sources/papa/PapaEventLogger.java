package papa;

import android.util.Log;

/* loaded from: classes3.dex */
public final class PapaEventLogger implements PapaEventListener {
    @Override // papa.PapaEventListener
    public final void onEvent(PapaEvent papaEvent) {
        Log.d("PapaEventLogger", papaEvent.toString());
    }
}
