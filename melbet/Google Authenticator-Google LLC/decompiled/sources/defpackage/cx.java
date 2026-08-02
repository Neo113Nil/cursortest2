package defpackage;

import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.preference.Preference;
import com.google.android.libraries.onegoogle.accountmanagement.AddAccountActivity;
import com.google.android.material.internal.NavigationMenuItemView;
import java.io.IOException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cx implements View.OnClickListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public cx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [gp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [gxq, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        final fwm fwmVar;
        boolean z = true;
        Message message4 = null;
        switch (this.b) {
            case 0:
                de deVar = (de) this.a;
                if (view == deVar.i && (message3 = deVar.k) != null) {
                    message4 = Message.obtain(message3);
                } else if (view == deVar.l && (message2 = deVar.n) != null) {
                    message4 = Message.obtain(message2);
                } else if (view == deVar.o && (message = deVar.q) != null) {
                    message4 = Message.obtain(message);
                }
                if (message4 != null) {
                    message4.sendToTarget();
                }
                deVar.H.obtainMessage(1, deVar.b).sendToTarget();
                break;
            case 1:
                ((cw) this.a).e();
                break;
            case 2:
                ((fg) this.a).f();
                break;
            case 3:
                ((Toolbar) this.a).j();
                break;
            case 4:
                ((Preference) this.a).b(view);
                break;
            case 5:
                ekx ekxVar = ((dfd) this.a).b;
                if (ekxVar != null) {
                    ekxVar.h();
                    break;
                }
                break;
            case 6:
                view.getClass();
                Context context = view.getContext();
                final String packageName = context.getPackageName();
                boolean m = jtp.a.bB().m(context);
                dsh dshVar = (dsh) this.a;
                fwm fwmVar2 = dshVar.c;
                if (!m) {
                    if (fwmVar2 != null) {
                        fwmVar2.u("ADD_ACCOUNT_ACTIVITY", packageName);
                    }
                    Context context2 = view.getContext();
                    context2.startActivity(new Intent(context2, (Class<?>) AddAccountActivity.class));
                    break;
                } else {
                    if (fwmVar2 != null) {
                        fwmVar2.u("ACCOUNT_MANAGER", packageName);
                        fwmVar = fwmVar2;
                    } else {
                        fwmVar = null;
                    }
                    final dqy dqyVar = dshVar.a;
                    final dov dovVar = dshVar.b;
                    context.getClass();
                    packageName.getClass();
                    final Context applicationContext = context.getApplicationContext();
                    AccountManager.get(context).addAccount("com.google", null, null, null, (Activity) dih.al(context, Activity.class), new AccountManagerCallback() { // from class: drw
                        @Override // android.accounts.AccountManagerCallback
                        public final void run(AccountManagerFuture accountManagerFuture) {
                            Bundle bundle;
                            fwm fwmVar3;
                            fwm fwmVar4 = fwm.this;
                            String str = packageName;
                            try {
                                bundle = (Bundle) accountManagerFuture.getResult();
                                fwmVar3 = fwmVar4;
                            } catch (Exception e) {
                                if (e instanceof OperationCanceledException) {
                                    if (fwmVar4 != null) {
                                        fwmVar4.t("CANCELLED", str);
                                        fwmVar3 = fwmVar4;
                                        bundle = null;
                                    }
                                    bundle = null;
                                    fwmVar3 = null;
                                } else if (e instanceof IOException) {
                                    if (fwmVar4 != null) {
                                        fwmVar4.t("IO_EXCEPTION", str);
                                        fwmVar3 = fwmVar4;
                                        bundle = null;
                                    }
                                    bundle = null;
                                    fwmVar3 = null;
                                } else {
                                    if (!(e instanceof AuthenticatorException)) {
                                        if (fwmVar4 == null) {
                                            throw e;
                                        }
                                        fwmVar4.t("UNKNOWN_EXCEPTION", str);
                                        throw e;
                                    }
                                    if (fwmVar4 != null) {
                                        fwmVar4.t("AUTHENTICATOR_EXCEPTION", str);
                                        fwmVar3 = fwmVar4;
                                        bundle = null;
                                    }
                                    bundle = null;
                                    fwmVar3 = null;
                                }
                            }
                            if (bundle == null) {
                                return;
                            }
                            Intent intent = (Intent) pj.h(bundle, "intent", Intent.class);
                            if (intent != null) {
                                if (fwmVar3 != null) {
                                    fwmVar3.t("INTENT_LAUNCHED", str);
                                }
                                Context context3 = applicationContext;
                                intent.addFlags(268435456);
                                context3.startActivity(intent);
                                return;
                            }
                            String string = bundle.getString("authAccount");
                            if (string == null) {
                                if (fwmVar3 != null) {
                                    fwmVar3.t("NO_ACCOUNT_IN_BUNDLE", str);
                                }
                            } else {
                                dov dovVar2 = dovVar;
                                dqy dqyVar2 = dqyVar;
                                Handler handler = new Handler(Looper.getMainLooper());
                                drx drxVar = new drx(dqyVar2, fwmVar3, str, handler, dovVar2, string);
                                dqyVar2.e(drxVar);
                                handler.postDelayed(drxVar.a, 10000L);
                            }
                        }
                    }, null);
                    break;
                }
            case 7:
                view.getClass();
                ((dsf) ((gjl) this.a).c).b.c(null);
                break;
            case 8:
                ((dye) this.a).performClick();
                break;
            case 9:
                eea eeaVar = (eea) this.a;
                eeaVar.e.d.f(new cfe(5), view);
                eeaVar.q(true != eeaVar.b ? 44 : 45);
                eeaVar.i(!eeaVar.b);
                break;
            case 10:
                ?? r0 = this.a;
                fjj fjjVar = (fjj) r0;
                fjjVar.l(true);
                gf gfVar = ((NavigationMenuItemView) view).l;
                boolean z2 = fjjVar.c.z(gfVar, r0, 0);
                if (gfVar != null && gfVar.isCheckable() && z2) {
                    fjjVar.e.u(gfVar);
                } else {
                    z = false;
                }
                fjjVar.l(false);
                if (z) {
                    fjjVar.j();
                    break;
                }
                break;
            case 11:
                ((fng) this.a).c();
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                fng fngVar = (fng) this.a;
                fngVar.k.setText("");
                fngVar.j.setText("");
                fngVar.d();
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((fng) this.a).h();
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj = this.a;
                fqe fqeVar = (fqe) obj;
                EditText editText = fqeVar.a;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (view.hasFocus()) {
                        fqeVar.a.requestFocus();
                    }
                    if (text != null) {
                        text.clear();
                    }
                    ((fqt) obj).x();
                    break;
                }
                break;
            case 15:
                ((fqo) this.a).m();
                break;
            case 16:
                Object obj2 = this.a;
                fqz fqzVar = (fqz) obj2;
                EditText editText2 = fqzVar.a;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    if (fqzVar.k()) {
                        fqzVar.a.setTransformationMethod(null);
                    } else {
                        fqzVar.a.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        fqzVar.a.setSelection(selectionEnd);
                    }
                    ((fqt) obj2).x();
                    break;
                }
                break;
            default:
                hoq.ab(this.a, view);
                break;
        }
    }

    public /* synthetic */ cx(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
