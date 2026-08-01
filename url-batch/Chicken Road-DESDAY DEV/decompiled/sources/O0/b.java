package O0;

import a1.InterfaceC0059a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.playgen.securelock.GeneratorActivity;
import com.playgen.securelock.MainActivity;
import com.playgen.securelock.R;
import com.playgen.securelock.SettingsActivity;
import com.playgen.securelock.view.NeonBackgroundView;
import g.AbstractActivityC0133i;
import k0.k;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements InterfaceC0059a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0133i f619b;

    public /* synthetic */ b(AbstractActivityC0133i abstractActivityC0133i, int i) {
        this.f618a = i;
        this.f619b = abstractActivityC0133i;
    }

    @Override // a1.InterfaceC0059a
    public final Object a() {
        int i = R.id.neonBackground;
        AbstractActivityC0133i abstractActivityC0133i = this.f619b;
        switch (this.f618a) {
            case 0:
                int i2 = GeneratorActivity.f1928D;
                View inflate = ((GeneratorActivity) abstractActivityC0133i).getLayoutInflater().inflate(R.layout.activity_generator, (ViewGroup) null, false);
                int i3 = R.id.btnCopy;
                Button button = (Button) k.f(inflate, R.id.btnCopy);
                if (button != null) {
                    i3 = R.id.btnGenerate;
                    Button button2 = (Button) k.f(inflate, R.id.btnGenerate);
                    if (button2 != null) {
                        i3 = R.id.btnSettings;
                        Button button3 = (Button) k.f(inflate, R.id.btnSettings);
                        if (button3 != null) {
                            i3 = R.id.mainPanel;
                            LinearLayout linearLayout = (LinearLayout) k.f(inflate, R.id.mainPanel);
                            if (linearLayout != null) {
                                NeonBackgroundView neonBackgroundView = (NeonBackgroundView) k.f(inflate, R.id.neonBackground);
                                if (neonBackgroundView != null) {
                                    i = R.id.passwordText;
                                    TextView textView = (TextView) k.f(inflate, R.id.passwordText);
                                    if (textView != null) {
                                        FrameLayout frameLayout = (FrameLayout) inflate;
                                        i = R.id.strengthBar;
                                        ProgressBar progressBar = (ProgressBar) k.f(inflate, R.id.strengthBar);
                                        if (progressBar != null) {
                                            i = R.id.strengthText;
                                            TextView textView2 = (TextView) k.f(inflate, R.id.strengthText);
                                            if (textView2 != null) {
                                                i = R.id.titleText;
                                                TextView textView3 = (TextView) k.f(inflate, R.id.titleText);
                                                if (textView3 != null) {
                                                    i = R.id.typeDescription;
                                                    TextView textView4 = (TextView) k.f(inflate, R.id.typeDescription);
                                                    if (textView4 != null) {
                                                        i = R.id.typeRowBottom;
                                                        LinearLayout linearLayout2 = (LinearLayout) k.f(inflate, R.id.typeRowBottom);
                                                        if (linearLayout2 != null) {
                                                            i = R.id.typeRowTop;
                                                            LinearLayout linearLayout3 = (LinearLayout) k.f(inflate, R.id.typeRowTop);
                                                            if (linearLayout3 != null) {
                                                                return new Q0.a(frameLayout, button, button2, button3, linearLayout, neonBackgroundView, textView, frameLayout, progressBar, textView2, textView3, textView4, linearLayout2, linearLayout3);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
                            }
                        }
                    }
                }
                i = i3;
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
            case 1:
                int i4 = MainActivity.f1934D;
                View inflate2 = ((MainActivity) abstractActivityC0133i).getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                if (inflate2 != null) {
                    return new Q0.b((ConstraintLayout) inflate2);
                }
                throw new NullPointerException("rootView");
            default:
                int i5 = SettingsActivity.f1940C;
                View inflate3 = ((SettingsActivity) abstractActivityC0133i).getLayoutInflater().inflate(R.layout.activity_settings, (ViewGroup) null, false);
                int i6 = R.id.alnumLengthSeek;
                SeekBar seekBar = (SeekBar) k.f(inflate3, R.id.alnumLengthSeek);
                if (seekBar != null) {
                    i6 = R.id.alnumLengthValue;
                    TextView textView5 = (TextView) k.f(inflate3, R.id.alnumLengthValue);
                    if (textView5 != null) {
                        i6 = R.id.btnBack;
                        Button button4 = (Button) k.f(inflate3, R.id.btnBack);
                        if (button4 != null) {
                            i6 = R.id.btnSave;
                            Button button5 = (Button) k.f(inflate3, R.id.btnSave);
                            if (button5 != null) {
                                i6 = R.id.btnSepHyphen;
                                Button button6 = (Button) k.f(inflate3, R.id.btnSepHyphen);
                                if (button6 != null) {
                                    i6 = R.id.btnSepSpace;
                                    Button button7 = (Button) k.f(inflate3, R.id.btnSepSpace);
                                    if (button7 != null) {
                                        i6 = R.id.btnSepUnderscore;
                                        Button button8 = (Button) k.f(inflate3, R.id.btnSepUnderscore);
                                        if (button8 != null) {
                                            i6 = R.id.groupAlphanumeric;
                                            LinearLayout linearLayout4 = (LinearLayout) k.f(inflate3, R.id.groupAlphanumeric);
                                            if (linearLayout4 != null) {
                                                i6 = R.id.groupHex;
                                                LinearLayout linearLayout5 = (LinearLayout) k.f(inflate3, R.id.groupHex);
                                                if (linearLayout5 != null) {
                                                    i6 = R.id.groupPassphrase;
                                                    LinearLayout linearLayout6 = (LinearLayout) k.f(inflate3, R.id.groupPassphrase);
                                                    if (linearLayout6 != null) {
                                                        i6 = R.id.groupPin;
                                                        LinearLayout linearLayout7 = (LinearLayout) k.f(inflate3, R.id.groupPin);
                                                        if (linearLayout7 != null) {
                                                            i6 = R.id.groupSecure;
                                                            LinearLayout linearLayout8 = (LinearLayout) k.f(inflate3, R.id.groupSecure);
                                                            if (linearLayout8 != null) {
                                                                i6 = R.id.hexLengthSeek;
                                                                SeekBar seekBar2 = (SeekBar) k.f(inflate3, R.id.hexLengthSeek);
                                                                if (seekBar2 != null) {
                                                                    i6 = R.id.hexLengthValue;
                                                                    TextView textView6 = (TextView) k.f(inflate3, R.id.hexLengthValue);
                                                                    if (textView6 != null) {
                                                                        i6 = R.id.lengthSeek;
                                                                        SeekBar seekBar3 = (SeekBar) k.f(inflate3, R.id.lengthSeek);
                                                                        if (seekBar3 != null) {
                                                                            i6 = R.id.lengthValue;
                                                                            TextView textView7 = (TextView) k.f(inflate3, R.id.lengthValue);
                                                                            if (textView7 != null) {
                                                                                NeonBackgroundView neonBackgroundView2 = (NeonBackgroundView) k.f(inflate3, R.id.neonBackground);
                                                                                if (neonBackgroundView2 != null) {
                                                                                    i = R.id.pinLengthSeek;
                                                                                    SeekBar seekBar4 = (SeekBar) k.f(inflate3, R.id.pinLengthSeek);
                                                                                    if (seekBar4 != null) {
                                                                                        i = R.id.pinLengthValue;
                                                                                        TextView textView8 = (TextView) k.f(inflate3, R.id.pinLengthValue);
                                                                                        if (textView8 != null) {
                                                                                            FrameLayout frameLayout2 = (FrameLayout) inflate3;
                                                                                            i = R.id.settingsPanel;
                                                                                            LinearLayout linearLayout9 = (LinearLayout) k.f(inflate3, R.id.settingsPanel);
                                                                                            if (linearLayout9 != null) {
                                                                                                i = R.id.settingsTitle;
                                                                                                TextView textView9 = (TextView) k.f(inflate3, R.id.settingsTitle);
                                                                                                if (textView9 != null) {
                                                                                                    i = R.id.settingsTypeLabel;
                                                                                                    TextView textView10 = (TextView) k.f(inflate3, R.id.settingsTypeLabel);
                                                                                                    if (textView10 != null) {
                                                                                                        i = R.id.switchDigits;
                                                                                                        Switch r31 = (Switch) k.f(inflate3, R.id.switchDigits);
                                                                                                        if (r31 != null) {
                                                                                                            i = R.id.switchLower;
                                                                                                            Switch r32 = (Switch) k.f(inflate3, R.id.switchLower);
                                                                                                            if (r32 != null) {
                                                                                                                i = R.id.switchSymbols;
                                                                                                                Switch r33 = (Switch) k.f(inflate3, R.id.switchSymbols);
                                                                                                                if (r33 != null) {
                                                                                                                    i = R.id.switchUpper;
                                                                                                                    Switch r34 = (Switch) k.f(inflate3, R.id.switchUpper);
                                                                                                                    if (r34 != null) {
                                                                                                                        i = R.id.wordCountSeek;
                                                                                                                        SeekBar seekBar5 = (SeekBar) k.f(inflate3, R.id.wordCountSeek);
                                                                                                                        if (seekBar5 != null) {
                                                                                                                            i = R.id.wordCountValue;
                                                                                                                            TextView textView11 = (TextView) k.f(inflate3, R.id.wordCountValue);
                                                                                                                            if (textView11 != null) {
                                                                                                                                return new Q0.c(frameLayout2, seekBar, textView5, button4, button5, button6, button7, button8, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, seekBar2, textView6, seekBar3, textView7, neonBackgroundView2, seekBar4, textView8, frameLayout2, linearLayout9, textView9, textView10, r31, r32, r33, r34, seekBar5, textView11);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                throw new NullPointerException("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i)));
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i = i6;
                throw new NullPointerException("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i)));
        }
    }
}
