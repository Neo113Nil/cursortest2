package io.flutter.plugins.urllauncher;

import android.content.Context;
import android.content.Intent;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.urllauncher.Messages;
import io.flutter.plugins.urllauncher.UrlLauncher;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements BasicMessageChannel.MessageHandler, UrlLauncher.IntentResolver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13588b;

    public /* synthetic */ a(int i4, Object obj) {
        this.f13587a = i4;
        this.f13588b = obj;
    }

    @Override // io.flutter.plugins.urllauncher.UrlLauncher.IntentResolver
    public String getHandlerComponentName(Intent intent) {
        String lambda$new$0;
        lambda$new$0 = UrlLauncher.lambda$new$0((Context) this.f13588b, intent);
        return lambda$new$0;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.f13587a) {
            case 0:
                Messages.UrlLauncherApi.lambda$setUp$0((Messages.UrlLauncherApi) this.f13588b, obj, reply);
                break;
            case 1:
                Messages.UrlLauncherApi.lambda$setUp$1((Messages.UrlLauncherApi) this.f13588b, obj, reply);
                break;
            case 2:
                Messages.UrlLauncherApi.lambda$setUp$2((Messages.UrlLauncherApi) this.f13588b, obj, reply);
                break;
            case 3:
                Messages.UrlLauncherApi.lambda$setUp$3((Messages.UrlLauncherApi) this.f13588b, obj, reply);
                break;
            default:
                Messages.UrlLauncherApi.lambda$setUp$4((Messages.UrlLauncherApi) this.f13588b, obj, reply);
                break;
        }
    }
}
