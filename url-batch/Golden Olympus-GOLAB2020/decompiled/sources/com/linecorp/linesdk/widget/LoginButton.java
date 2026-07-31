package com.linecorp.linesdk.widget;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.a;
import com.linecorp.linesdk.LoginDelegate;
import com.linecorp.linesdk.LoginListener;
import com.linecorp.linesdk.R;
import com.linecorp.linesdk.Scope;
import com.linecorp.linesdk.auth.LineAuthenticationParams;
import com.linecorp.linesdk.internal.FragmentWrapper;
import com.linecorp.linesdk.internal.LoginDelegateImpl;
import com.linecorp.linesdk.internal.LoginHandler;
import com.linecorp.linesdk.widget.LoginButton;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class LoginButton extends AppCompatTextView {

    @NonNull
    private LineAuthenticationParams authenticationParams;
    private String channelId;
    private FragmentWrapper fragmentWrapper;

    @NonNull
    private View.OnClickListener internalListener;
    private boolean isLineAppAuthEnabled;
    private LoginDelegate loginDelegate;

    @NonNull
    private LoginHandler loginHandler;

    public LoginButton(Context context) {
        super(context);
        this.isLineAppAuthEnabled = true;
        this.authenticationParams = new LineAuthenticationParams.Builder().scopes(Arrays.asList(Scope.PROFILE)).build();
        this.loginHandler = new LoginHandler();
        this.internalListener = new View.OnClickListener() { // from class: a1.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginButton.d(LoginButton.this, view);
            }
        };
        init();
    }

    public static /* synthetic */ void d(LoginButton loginButton, View view) {
        String str = loginButton.channelId;
        if (str == null) {
            throw new RuntimeException("Channel id should be set.");
        }
        if (str.isEmpty()) {
            throw new RuntimeException("Channel id should not be empty.");
        }
        FragmentWrapper fragmentWrapper = loginButton.fragmentWrapper;
        if (fragmentWrapper != null) {
            loginButton.performLoginWithFragment(loginButton.channelId, fragmentWrapper);
        } else {
            loginButton.performLoginWithActivity(loginButton.channelId, loginButton.getActivity());
        }
    }

    public static /* synthetic */ void e(LoginButton loginButton, View.OnClickListener onClickListener, View view) {
        loginButton.internalListener.onClick(view);
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @NonNull
    private Activity getActivity() {
        Context context = getContext();
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        throw new RuntimeException("Cannot find an Activity");
    }

    private void init() {
        setAllCaps(false);
        setGravity(17);
        setText(R.string.btn_line_login);
        setTextColor(a.d(getContext(), R.color.text_login_btn));
        setBackgroundResource(R.drawable.background_login_btn);
        super.setOnClickListener(this.internalListener);
    }

    private void performLoginWithActivity(@NonNull String str, @NonNull Activity activity) {
        this.loginHandler.performLogin(activity, this.isLineAppAuthEnabled, str, this.authenticationParams);
    }

    private void performLoginWithFragment(@NonNull String str, @NonNull FragmentWrapper fragmentWrapper) {
        this.loginHandler.performLogin(getActivity(), fragmentWrapper, this.isLineAppAuthEnabled, str, this.authenticationParams);
    }

    public void addLoginListener(@NonNull LoginListener loginListener) {
        if (this.loginDelegate == null) {
            throw new RuntimeException("You must set LoginDelegate through setLoginDelegate()  first");
        }
        this.loginHandler.addLoginListener(loginListener);
    }

    public void enableLineAppAuthentication(boolean z4) {
        this.isLineAppAuthEnabled = z4;
    }

    public void removeLoginListener(@NonNull LoginListener loginListener) {
        this.loginHandler.removeLoginListener(loginListener);
    }

    public void setAuthenticationParams(@NonNull LineAuthenticationParams lineAuthenticationParams) {
        this.authenticationParams = lineAuthenticationParams;
    }

    public void setChannelId(@NonNull String str) {
        this.channelId = str;
    }

    public void setFragment(@NonNull Fragment fragment) {
        this.fragmentWrapper = new FragmentWrapper(fragment);
    }

    public void setLoginDelegate(@NonNull LoginDelegate loginDelegate) {
        if (!(loginDelegate instanceof LoginDelegateImpl)) {
            throw new RuntimeException("Unexpected LoginDelegate, please use the provided Factory to create the instance");
        }
        ((LoginDelegateImpl) loginDelegate).setLoginHandler(this.loginHandler);
        this.loginDelegate = loginDelegate;
    }

    @Override // android.view.View
    public void setOnClickListener(final View.OnClickListener onClickListener) {
        super.setOnClickListener(new View.OnClickListener() { // from class: a1.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginButton.e(LoginButton.this, onClickListener, view);
            }
        });
    }

    public void setFragment(@NonNull androidx.fragment.app.Fragment fragment) {
        this.fragmentWrapper = new FragmentWrapper(fragment);
    }

    public LoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isLineAppAuthEnabled = true;
        this.authenticationParams = new LineAuthenticationParams.Builder().scopes(Arrays.asList(Scope.PROFILE)).build();
        this.loginHandler = new LoginHandler();
        this.internalListener = new View.OnClickListener() { // from class: a1.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginButton.d(LoginButton.this, view);
            }
        };
        init();
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.isLineAppAuthEnabled = true;
        this.authenticationParams = new LineAuthenticationParams.Builder().scopes(Arrays.asList(Scope.PROFILE)).build();
        this.loginHandler = new LoginHandler();
        this.internalListener = new View.OnClickListener() { // from class: a1.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginButton.d(LoginButton.this, view);
            }
        };
        init();
    }
}
