package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class zv {
    public static boolean BRwzKIf41E4i;
    public static int XL4ISE6Oc65B;
    public static dw1 dgRBjINgWbAK;
    public static final md PxuCJdSBwIXG = new md(-1.0f);
    public static final md lS5Rgt96tfkO = new md(1.0f);
    public static final on TSizfFm2Yiuu = new on(1988164992, false, new HGgCfDnf0ga9(3));
    public static final on Y1f8riQaR6yg = new on(-6152073, false, new HGgCfDnf0ga9(4));
    public static final on e9gEMXR7LXtO = new on(3618488, false, new HGgCfDnf0ga9(5));
    public static final on a92UlCVFR9N8 = new on(23159610, false, new HGgCfDnf0ga9(6));
    public static final on RAsUl2FVSrh6 = new on(32930171, false, new HGgCfDnf0ga9(7));
    public static final db0 rtx2ld2ELZv4 = new db0(8);
    public static final float[] OPXfSBeufaJ8 = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final long[] wdg6QnbFHrFF = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
    public static final jx1 x50lh2ztY7Y5 = new jx1(28);
    public static final ib0 cpQdD2nAriOS = new ib0(10);
    public static final Object r3s1LDPKFs1S = new Object();
    public static final b5 QrzZRwfaDlRX = new b5(1022);
    public static final Object gPXPFXrUH4XX = new Object();

    public static final ab0 BRwzKIf41E4i(ab0 ab0Var) {
        ab0 a92UlCVFR9N82 = ((qa0) ((r1) wLFCmsViZrNT(ab0Var)).getFocusOwner()).a92UlCVFR9N8();
        if (a92UlCVFR9N82 == null || !a92UlCVFR9N82.S9EYkSpbGuxq) {
            return null;
        }
        return a92UlCVFR9N82;
    }

    public static final boolean BjEWd04qc7Mw(ab0 ab0Var) {
        vw0 vw0Var;
        pd1 pd1Var;
        vw0 vw0Var2;
        pd1 pd1Var2 = ab0Var.QrzZRwfaDlRX;
        return (pd1Var2 == null || (vw0Var = pd1Var2.VhhvGxCb8gfr) == null || !vw0Var.EpkonXwzFgDB() || (pd1Var = ab0Var.QrzZRwfaDlRX) == null || (vw0Var2 = pd1Var.VhhvGxCb8gfr) == null || !vw0Var2.J54yh1s3n4Aq()) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ab0 EcgxDIVH5in8(ab0 ab0Var) {
        boolean z = ab0Var.rtx2ld2ELZv4.S9EYkSpbGuxq;
        if (z) {
            if (!z) {
                ep0.lS5Rgt96tfkO("visitChildren called on an unattached node");
            }
            f91 f91Var = new f91(new m61[16]);
            m61 m61Var = ab0Var.rtx2ld2ELZv4;
            m61 m61Var2 = m61Var.cpQdD2nAriOS;
            if (m61Var2 == null) {
                OPXfSBeufaJ8(f91Var, m61Var);
            } else {
                f91Var.lS5Rgt96tfkO(m61Var2);
            }
            loop0: while (true) {
                int i = f91Var.wdg6QnbFHrFF;
                if (i == 0) {
                    break;
                }
                m61 m61Var3 = (m61) f91Var.dgRBjINgWbAK(i - 1);
                if ((m61Var3.dgRBjINgWbAK & 1024) == 0) {
                    OPXfSBeufaJ8(f91Var, m61Var3);
                } else {
                    while (true) {
                        if (m61Var3 == null) {
                            break;
                        }
                        if ((m61Var3.wdg6QnbFHrFF & 1024) != 0) {
                            f91 f91Var2 = null;
                            while (m61Var3 != null) {
                                if (m61Var3 instanceof ab0) {
                                    ab0 ab0Var2 = (ab0) m61Var3;
                                    if (ab0Var2.rtx2ld2ELZv4.S9EYkSpbGuxq) {
                                        int ordinal = ab0Var2.FT2GK7JK5Ma2().ordinal();
                                        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                            break loop0;
                                        }
                                        if (ordinal != 3) {
                                            u9.gPXPFXrUH4XX();
                                            return null;
                                        }
                                    }
                                } else if ((m61Var3.wdg6QnbFHrFF & 1024) != 0 && (m61Var3 instanceof ux)) {
                                    int i2 = 0;
                                    for (m61 m61Var4 = ((ux) m61Var3).S2OOm9zPNm0h; m61Var4 != null; m61Var4 = m61Var4.cpQdD2nAriOS) {
                                        if ((m61Var4.wdg6QnbFHrFF & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                m61Var3 = m61Var4;
                                            } else {
                                                if (f91Var2 == null) {
                                                    f91Var2 = new f91(new m61[16]);
                                                }
                                                if (m61Var3 != null) {
                                                    f91Var2.lS5Rgt96tfkO(m61Var3);
                                                    m61Var3 = null;
                                                }
                                                f91Var2.lS5Rgt96tfkO(m61Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                m61Var3 = dgRBjINgWbAK(f91Var2);
                            }
                        } else {
                            m61Var3 = m61Var3.cpQdD2nAriOS;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final n61 EpkonXwzFgDB(n61 n61Var, f4 f4Var, yz0 yz0Var, eh2 eh2Var) {
        return n61Var.TSizfFm2Yiuu(new sz0(f4Var, yz0Var, eh2Var));
    }

    public static final n61 IAToe7bXGz4N(n61 n61Var, float f, float f2, float f3, float f4, long j, z42 z42Var, boolean z, long j2, long j3) {
        return n61Var.TSizfFm2Yiuu(new qh0(f, f2, f3, f4, j, z42Var, z, j2, j3));
    }

    public static final long IXK6ba3ucyzm(long j, long j2) {
        int Y1f8riQaR6yg2;
        int a92UlCVFR9N82 = vi2.a92UlCVFR9N8(j);
        int e9gEMXR7LXtO2 = vi2.e9gEMXR7LXtO(j);
        if ((vi2.a92UlCVFR9N8(j2) < vi2.e9gEMXR7LXtO(j)) && (vi2.a92UlCVFR9N8(j) < vi2.e9gEMXR7LXtO(j2))) {
            if ((vi2.a92UlCVFR9N8(j2) <= vi2.a92UlCVFR9N8(j)) && (vi2.e9gEMXR7LXtO(j) <= vi2.e9gEMXR7LXtO(j2))) {
                a92UlCVFR9N82 = vi2.a92UlCVFR9N8(j2);
                e9gEMXR7LXtO2 = a92UlCVFR9N82;
            } else {
                if ((vi2.a92UlCVFR9N8(j) <= vi2.a92UlCVFR9N8(j2)) && (vi2.e9gEMXR7LXtO(j2) <= vi2.e9gEMXR7LXtO(j))) {
                    Y1f8riQaR6yg2 = vi2.Y1f8riQaR6yg(j2);
                } else {
                    int a92UlCVFR9N83 = vi2.a92UlCVFR9N8(j2);
                    if (a92UlCVFR9N82 >= vi2.e9gEMXR7LXtO(j2) || a92UlCVFR9N83 > a92UlCVFR9N82) {
                        e9gEMXR7LXtO2 = vi2.a92UlCVFR9N8(j2);
                    } else {
                        a92UlCVFR9N82 = vi2.a92UlCVFR9N8(j2);
                        Y1f8riQaR6yg2 = vi2.Y1f8riQaR6yg(j2);
                    }
                }
                e9gEMXR7LXtO2 -= Y1f8riQaR6yg2;
            }
        } else if (e9gEMXR7LXtO2 > vi2.a92UlCVFR9N8(j2)) {
            a92UlCVFR9N82 -= vi2.Y1f8riQaR6yg(j2);
            Y1f8riQaR6yg2 = vi2.Y1f8riQaR6yg(j2);
            e9gEMXR7LXtO2 -= Y1f8riQaR6yg2;
        }
        return jh0.rtx2ld2ELZv4(a92UlCVFR9N82, e9gEMXR7LXtO2);
    }

    public static final boolean J54yh1s3n4Aq(int i, int i2, long j) {
        int wdg6QnbFHrFF2 = rr.wdg6QnbFHrFF(j);
        if (i > rr.rtx2ld2ELZv4(j) || wdg6QnbFHrFF2 > i) {
            return false;
        }
        return i2 <= rr.RAsUl2FVSrh6(j) && rr.OPXfSBeufaJ8(j) <= i2;
    }

    public static final ko2 JHNfcAUfKc4G(bt btVar, hu huVar, Object obj) {
        ko2 ko2Var = null;
        if ((btVar instanceof tu) && huVar.S2OOm9zPNm0h(fi.dgRBjINgWbAK) != null) {
            tu tuVar = (tu) btVar;
            while (true) {
                if ((tuVar instanceof f00) || (tuVar = tuVar.TSizfFm2Yiuu()) == null) {
                    break;
                }
                if (tuVar instanceof ko2) {
                    ko2Var = (ko2) tuVar;
                    break;
                }
            }
            if (ko2Var != null) {
                ko2Var.uy1Qfkdvj4xZ(huVar, obj);
            }
        }
        return ko2Var;
    }

    public static final void OPXfSBeufaJ8(f91 f91Var, m61 m61Var) {
        f91 pnx5pC0XzaCw = zf8DYfih6EZu(m61Var).pnx5pC0XzaCw();
        int i = pnx5pC0XzaCw.wdg6QnbFHrFF - 1;
        Object[] objArr = pnx5pC0XzaCw.rtx2ld2ELZv4;
        if (i < objArr.length) {
            while (i >= 0) {
                f91Var.lS5Rgt96tfkO(((vw0) objArr[i]).nLZGh9p8gVSu.a92UlCVFR9N8);
                i--;
            }
        }
    }

    public static final pd1 POWyO8hTM6YC(tx txVar, int i) {
        pd1 pd1Var = ((m61) txVar).rtx2ld2ELZv4.QrzZRwfaDlRX;
        pd1Var.getClass();
        if (pd1Var.kRWHK87H9qm4() != txVar || !qd1.RAsUl2FVSrh6(i)) {
            return pd1Var;
        }
        pd1 pd1Var2 = pd1Var.S2OOm9zPNm0h;
        pd1Var2.getClass();
        return pd1Var2;
    }

    public static n61 Pf0ThKz3j5YS(n61 n61Var, qi1 qi1Var, jl jlVar) {
        s.Companion.getClass();
        return n61Var.TSizfFm2Yiuu(new ri1(qi1Var, jlVar));
    }

    public static final t0 PxuCJdSBwIXG(w3 w3Var) {
        Canvas canvas = u0.PxuCJdSBwIXG;
        t0 t0Var = new t0();
        t0Var.PxuCJdSBwIXG = new Canvas(b51.xfACYKDMU6Dj(w3Var));
        return t0Var;
    }

    public static int QrzZRwfaDlRX(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final void RAsUl2FVSrh6(int i, hp hpVar, final ae0 ae0Var, n61 n61Var, final boolean z) {
        int i2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(2111672474);
        if ((i & 6) == 0) {
            i2 = (tf0Var.a92UlCVFR9N8(n61Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (tf0Var.rtx2ld2ELZv4(ae0Var) ? 32 : 16) | (tf0Var.RAsUl2FVSrh6(z) ? 256 : 128);
        if (tf0Var.Pf0ThKz3j5YS(i3 & 1, (i3 & 147) != 146)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            k32 k32Var = u22.PxuCJdSBwIXG;
            ki0.wdg6QnbFHrFF(tf0Var, ov2.VhhvGxCb8gfr(c62.RAsUl2FVSrh6(n61Var, 25.0f, 25.0f), new qe0() { // from class: y5
                /* JADX WARN: Code restructure failed: missing block: B:4:0x003c, code lost:
                
                    if (r3 == defpackage.fp.lS5Rgt96tfkO) goto L6;
                 */
                @Override // defpackage.qe0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object a92UlCVFR9N8(Object obj, Object obj2, Object obj3) {
                    n61 n61Var2 = (n61) obj;
                    ((Integer) obj3).getClass();
                    tf0 tf0Var2 = (tf0) ((hp) obj2);
                    tf0Var2.IXK6ba3ucyzm(-196777734);
                    gg1 gg1Var2 = mp.PxuCJdSBwIXG;
                    final long j = ((wi2) tf0Var2.wdg6QnbFHrFF(xi2.PxuCJdSBwIXG)).PxuCJdSBwIXG;
                    boolean e9gEMXR7LXtO2 = tf0Var2.e9gEMXR7LXtO(j);
                    final ae0 ae0Var2 = ae0.this;
                    boolean a92UlCVFR9N82 = e9gEMXR7LXtO2 | tf0Var2.a92UlCVFR9N8(ae0Var2);
                    final boolean z2 = z;
                    boolean RAsUl2FVSrh62 = a92UlCVFR9N82 | tf0Var2.RAsUl2FVSrh6(z2);
                    Object nLZGh9p8gVSu = tf0Var2.nLZGh9p8gVSu();
                    if (!RAsUl2FVSrh62) {
                        hp.Companion.getClass();
                    }
                    nLZGh9p8gVSu = new le0() { // from class: z5
                        @Override // defpackage.le0
                        public final Object OPXfSBeufaJ8(Object obj4) {
                            eh ehVar = (eh) obj4;
                            final ym0 gPXPFXrUH4XX2 = zv.gPXPFXrUH4XX(ehVar, Float.intBitsToFloat((int) (ehVar.rtx2ld2ELZv4.Y1f8riQaR6yg() >> 32)) / 2.0f);
                            final td PxuCJdSBwIXG2 = il.PxuCJdSBwIXG(jl.Companion, j);
                            final ae0 ae0Var3 = ae0Var2;
                            final boolean z3 = z2;
                            return ehVar.PxuCJdSBwIXG(new le0() { // from class: r5
                                @Override // defpackage.le0
                                public final Object OPXfSBeufaJ8(Object obj5) {
                                    xw0 xw0Var = (xw0) obj5;
                                    xw0Var.PxuCJdSBwIXG();
                                    ji jiVar = xw0Var.rtx2ld2ELZv4;
                                    boolean booleanValue = ((Boolean) ae0.this.PxuCJdSBwIXG()).booleanValue();
                                    no2 no2Var = no2.PxuCJdSBwIXG;
                                    if (!booleanValue) {
                                        return no2Var;
                                    }
                                    boolean z4 = z3;
                                    ym0 ym0Var = gPXPFXrUH4XX2;
                                    td tdVar = PxuCJdSBwIXG2;
                                    if (!z4) {
                                        k30.cpQdD2nAriOS(xw0Var, ym0Var, tdVar);
                                        return no2Var;
                                    }
                                    long nxJAScVArhE9 = jiVar.nxJAScVArhE9();
                                    m9 m9Var = jiVar.OPXfSBeufaJ8;
                                    long S2OOm9zPNm0h = m9Var.S2OOm9zPNm0h();
                                    m9Var.gPXPFXrUH4XX().wdg6QnbFHrFF();
                                    try {
                                        ((i2) m9Var.OPXfSBeufaJ8).r3s1LDPKFs1S(-1.0f, 1.0f, nxJAScVArhE9);
                                        k30.cpQdD2nAriOS(xw0Var, ym0Var, tdVar);
                                        return no2Var;
                                    } finally {
                                        m9Var.gPXPFXrUH4XX().RAsUl2FVSrh6();
                                        m9Var.ozEBbv0hFTAB(S2OOm9zPNm0h);
                                    }
                                }
                            });
                        }
                    };
                    tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu);
                    n61 tmVwIGCQF4zR = fx1.tmVwIGCQF4zR(n61Var2, (le0) nLZGh9p8gVSu);
                    tf0Var2.gPXPFXrUH4XX(false);
                    return tmVwIGCQF4zR;
                }
            }));
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new x5(n61Var, ae0Var, z, i);
        }
    }

    public static final hu RfyTYNmI9Srp(hu huVar, hu huVar2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 6;
        byte b = 0;
        boolean booleanValue = ((Boolean) huVar.IAToe7bXGz4N(new jm(i, b), bool)).booleanValue();
        boolean booleanValue2 = ((Boolean) huVar2.IAToe7bXGz4N(new jm(i, b), bool)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return huVar.RfyTYNmI9Srp(huVar2);
        }
        jm jmVar = new jm(4, b);
        n50 n50Var = n50.rtx2ld2ELZv4;
        hu huVar3 = (hu) huVar.IAToe7bXGz4N(jmVar, n50Var);
        Object obj = huVar2;
        if (booleanValue2) {
            obj = huVar2.IAToe7bXGz4N(new jm(5, b), n50Var);
        }
        return huVar3.RfyTYNmI9Srp((hu) obj);
    }

    public static final int S2OOm9zPNm0h(SerialDescriptor serialDescriptor, ht0 ht0Var, String str) {
        serialDescriptor.getClass();
        ht0Var.getClass();
        str.getClass();
        xfACYKDMU6Dj(ht0Var, serialDescriptor);
        int PxuCJdSBwIXG2 = serialDescriptor.PxuCJdSBwIXG(str);
        if (PxuCJdSBwIXG2 != -3) {
            return PxuCJdSBwIXG2;
        }
        dr drVar = ht0Var.TSizfFm2Yiuu;
        e6 e6Var = new e6(15, serialDescriptor, ht0Var);
        drVar.getClass();
        ConcurrentHashMap concurrentHashMap = drVar.PxuCJdSBwIXG;
        Map map = (Map) concurrentHashMap.get(serialDescriptor);
        jx1 jx1Var = x50lh2ztY7Y5;
        Object obj = map != null ? map.get(jx1Var) : null;
        Object obj2 = obj != null ? obj : null;
        if (obj2 == null) {
            obj2 = e6Var.PxuCJdSBwIXG();
            Object obj3 = concurrentHashMap.get(serialDescriptor);
            if (obj3 == null) {
                obj3 = new ConcurrentHashMap(2);
                concurrentHashMap.put(serialDescriptor, obj3);
            }
            ((Map) obj3).put(jx1Var, obj2);
        }
        Integer num = (Integer) ((Map) obj2).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final float S9EYkSpbGuxq(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TSizfFm2Yiuu(ir1[] ir1VarArr, pe0 pe0Var, hp hpVar, int i) {
        il1 PsecLrZVVK61;
        boolean z;
        zs1 XL4ISE6Oc65B2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(415205898);
        jr0 jr0Var = tf0Var.ZbWwgt3aGe7A;
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        il1 x50lh2ztY7Y52 = tf0Var.x50lh2ztY7Y5();
        tf0Var.xbgXKYA2cIfu(201, mp.lS5Rgt96tfkO);
        if (tf0Var.zf8DYfih6EZu) {
            kj0.tmVwIGCQF4zR();
            PsecLrZVVK61 = tf0Var.PsecLrZVVK61(x50lh2ztY7Y52, hq0.IXK6ba3ucyzm(ir1VarArr, x50lh2ztY7Y52, il1.dgRBjINgWbAK));
            tf0Var.EpkonXwzFgDB = true;
        } else {
            z62 z62Var = tf0Var.ozEBbv0hFTAB;
            Object rtx2ld2ELZv42 = z62Var.rtx2ld2ELZv4(z62Var.RAsUl2FVSrh6, 0);
            rtx2ld2ELZv42.getClass();
            il1 il1Var = (il1) rtx2ld2ELZv42;
            z62 z62Var2 = tf0Var.ozEBbv0hFTAB;
            Object rtx2ld2ELZv43 = z62Var2.rtx2ld2ELZv4(z62Var2.RAsUl2FVSrh6, 1);
            rtx2ld2ELZv43.getClass();
            il1 il1Var2 = (il1) rtx2ld2ELZv43;
            il1 IXK6ba3ucyzm = hq0.IXK6ba3ucyzm(ir1VarArr, x50lh2ztY7Y52, il1Var2);
            if (tf0Var.e6tOsSdd2EFb() && !tf0Var.pnx5pC0XzaCw && il1Var2.equals(IXK6ba3ucyzm)) {
                tf0Var.x50lh2ztY7Y5 = tf0Var.ozEBbv0hFTAB.RfyTYNmI9Srp() + tf0Var.x50lh2ztY7Y5;
                PsecLrZVVK61 = il1Var;
            } else {
                PsecLrZVVK61 = tf0Var.PsecLrZVVK61(x50lh2ztY7Y52, IXK6ba3ucyzm);
                if (tf0Var.pnx5pC0XzaCw || !cs0.wdg6QnbFHrFF(PsecLrZVVK61, il1Var)) {
                    z = true;
                    if (z && !tf0Var.zf8DYfih6EZu) {
                        tf0Var.EpkonXwzFgDB(PsecLrZVVK61);
                    }
                    jr0Var.TSizfFm2Yiuu(tf0Var.S2OOm9zPNm0h ? 1 : 0);
                    tf0Var.S2OOm9zPNm0h = z;
                    tf0Var.xfACYKDMU6Dj = PsecLrZVVK61;
                    gg1 gg1Var2 = mp.TSizfFm2Yiuu;
                    hi0.Companion.getClass();
                    tf0Var.zf8DYfih6EZu(202, 0, gg1Var2, PsecLrZVVK61);
                    pe0Var.rtx2ld2ELZv4(tf0Var, Integer.valueOf((i >> 3) & 14));
                    tf0Var.gPXPFXrUH4XX(false);
                    tf0Var.gPXPFXrUH4XX(false);
                    tf0Var.S2OOm9zPNm0h = jr0Var.lS5Rgt96tfkO() != 0;
                    tf0Var.xfACYKDMU6Dj = null;
                    XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
                    if (XL4ISE6Oc65B2 == null) {
                        XL4ISE6Oc65B2.Y1f8riQaR6yg = new ln(i, 2, ir1VarArr, pe0Var);
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        if (z) {
            tf0Var.EpkonXwzFgDB(PsecLrZVVK61);
        }
        jr0Var.TSizfFm2Yiuu(tf0Var.S2OOm9zPNm0h ? 1 : 0);
        tf0Var.S2OOm9zPNm0h = z;
        tf0Var.xfACYKDMU6Dj = PsecLrZVVK61;
        gg1 gg1Var22 = mp.TSizfFm2Yiuu;
        hi0.Companion.getClass();
        tf0Var.zf8DYfih6EZu(202, 0, gg1Var22, PsecLrZVVK61);
        pe0Var.rtx2ld2ELZv4(tf0Var, Integer.valueOf((i >> 3) & 14));
        tf0Var.gPXPFXrUH4XX(false);
        tf0Var.gPXPFXrUH4XX(false);
        tf0Var.S2OOm9zPNm0h = jr0Var.lS5Rgt96tfkO() != 0;
        tf0Var.xfACYKDMU6Dj = null;
        XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 == null) {
        }
    }

    public static final String VhhvGxCb8gfr(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final qt1 XL4ISE6Oc65B(ab0 ab0Var) {
        boolean z = ab0Var.S9EYkSpbGuxq;
        qt1 qt1Var = qt1.e9gEMXR7LXtO;
        if (!z) {
            qt1.Companion.getClass();
            return qt1Var;
        }
        pd1 pd1Var = ab0Var.QrzZRwfaDlRX;
        if (pd1Var != null) {
            bw0 ZbWwgt3aGe7A = kj0.ZbWwgt3aGe7A(pd1Var);
            if (!ZbWwgt3aGe7A.aF05bpZJlKEP()) {
                ZbWwgt3aGe7A = null;
            }
            if (ZbWwgt3aGe7A != null) {
                return ab0Var.Yadk4uqlxLy8(ZbWwgt3aGe7A);
            }
        }
        qt1.Companion.getClass();
        return qt1Var;
    }

    public static final void Y1f8riQaR6yg(ae0 ae0Var, xz xzVar, on onVar, hp hpVar, int i) {
        tf0 tf0Var;
        cw0 cw0Var;
        Object obj;
        int i2;
        tf0 tf0Var2 = (tf0) hpVar;
        tf0Var2.JHNfcAUfKc4G(826668973);
        int i3 = i | (tf0Var2.rtx2ld2ELZv4(ae0Var) ? 4 : 2) | (tf0Var2.a92UlCVFR9N8(xzVar) ? 32 : 16);
        if (tf0Var2.Pf0ThKz3j5YS(i3 & 1, (i3 & 147) != 146)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            View view = (View) tf0Var2.wdg6QnbFHrFF(h2.a92UlCVFR9N8);
            hy hyVar = (hy) tf0Var2.wdg6QnbFHrFF(eq.rtx2ld2ELZv4);
            cw0 cw0Var2 = (cw0) tf0Var2.wdg6QnbFHrFF(eq.r3s1LDPKFs1S);
            rf0 rZjpSjn4zoMv = cs0.rZjpSjn4zoMv(tf0Var2);
            d91 Pf0ThKz3j5YS = sj0.Pf0ThKz3j5YS(onVar, tf0Var2);
            Object[] objArr = new Object[0];
            Object nLZGh9p8gVSu = tf0Var2.nLZGh9p8gVSu();
            hp.Companion.getClass();
            jx1 jx1Var = fp.lS5Rgt96tfkO;
            if (nLZGh9p8gVSu == jx1Var) {
                nLZGh9p8gVSu = g2.QrzZRwfaDlRX;
                tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu);
            }
            Object amuv7NJvPxHu = sj0.amuv7NJvPxHu(Arrays.copyOf(objArr, 0), ov2.dgRBjINgWbAK, (ae0) nLZGh9p8gVSu, tf0Var2, 3456, 0);
            tf0 tf0Var3 = tf0Var2;
            UUID uuid = (UUID) amuv7NJvPxHu;
            boolean Y1f8riQaR6yg2 = tf0Var3.Y1f8riQaR6yg(xzVar.RAsUl2FVSrh6) | tf0Var3.a92UlCVFR9N8(view) | tf0Var3.a92UlCVFR9N8(hyVar) | tf0Var3.a92UlCVFR9N8(null);
            Object nLZGh9p8gVSu2 = tf0Var3.nLZGh9p8gVSu();
            if (Y1f8riQaR6yg2 || nLZGh9p8gVSu2 == jx1Var) {
                cw0Var = cw0Var2;
                zz zzVar = new zz(ae0Var, xzVar, view, cw0Var, hyVar, uuid);
                on onVar2 = new on(-1338939603, true, new XL4ISE6Oc65B(r12, Pf0ThKz3j5YS));
                tz tzVar = zzVar.QrzZRwfaDlRX;
                tzVar.setParentCompositionContext(rZjpSjn4zoMv);
                tzVar.XL4ISE6Oc65B.setValue(onVar2);
                tzVar.VhhvGxCb8gfr = true;
                tzVar.e9gEMXR7LXtO();
                tf0Var3.JTxCbbCwomzt(zzVar);
                obj = zzVar;
            } else {
                obj = nLZGh9p8gVSu2;
                cw0Var = cw0Var2;
            }
            zz zzVar2 = (zz) obj;
            boolean rtx2ld2ELZv42 = tf0Var3.rtx2ld2ELZv4(zzVar2);
            Object nLZGh9p8gVSu3 = tf0Var3.nLZGh9p8gVSu();
            if (rtx2ld2ELZv42 || nLZGh9p8gVSu3 == jx1Var) {
                i2 = 0;
                nLZGh9p8gVSu3 = new y2(zzVar2, i2);
                tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu3);
            } else {
                i2 = 0;
            }
            mm2.rtx2ld2ELZv4(zzVar2, (le0) nLZGh9p8gVSu3, tf0Var3);
            int i4 = (tf0Var3.rtx2ld2ELZv4(zzVar2) ? 1 : 0) | ((i3 & 14) == 4 ? 1 : i2) | ((i3 & 112) != 32 ? i2 : 1) | (tf0Var3.Y1f8riQaR6yg(cw0Var.ordinal()) ? 1 : 0);
            Object nLZGh9p8gVSu4 = tf0Var3.nLZGh9p8gVSu();
            if (i4 != 0 || nLZGh9p8gVSu4 == jx1Var) {
                nLZGh9p8gVSu4 = new z2(zzVar2, ae0Var, xzVar, cw0Var);
                tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu4);
            }
            mm2.r3s1LDPKFs1S((ae0) nLZGh9p8gVSu4, tf0Var3);
            tf0Var = tf0Var3;
        } else {
            tf0 tf0Var4 = tf0Var2;
            tf0Var4.i68hK7ahKtgp();
            tf0Var = tf0Var4;
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new a3(ae0Var, xzVar, onVar, i, 0);
        }
    }

    public static final int ZbWwgt3aGe7A(SerialDescriptor serialDescriptor, ht0 ht0Var, String str, String str2) {
        serialDescriptor.getClass();
        ht0Var.getClass();
        str.getClass();
        int S2OOm9zPNm0h = S2OOm9zPNm0h(serialDescriptor, ht0Var, str);
        if (S2OOm9zPNm0h != -3) {
            return S2OOm9zPNm0h;
        }
        throw new i42(serialDescriptor.lS5Rgt96tfkO() + " does not contain element with name '" + str + '\'' + str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x010d, code lost:
    
        if (r1 == defpackage.fp.lS5Rgt96tfkO) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a92UlCVFR9N8(final ef1 ef1Var, final boolean z, final iv1 iv1Var, final boolean z2, long j, final float f, final n61 n61Var, hp hpVar, final int i) {
        int i2;
        final long j2;
        int i3;
        long j3;
        final boolean z3;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-466280168);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? tf0Var.a92UlCVFR9N8(ef1Var) : tf0Var.rtx2ld2ELZv4(ef1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tf0Var.RAsUl2FVSrh6(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tf0Var.Y1f8riQaR6yg(iv1Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tf0Var.RAsUl2FVSrh6(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((1572864 & i) == 0) {
            i2 |= tf0Var.a92UlCVFR9N8(n61Var) ? 1048576 : 524288;
        }
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (533651 & i2) != 533650)) {
            tf0Var.wLFCmsViZrNT();
            if ((i & 1) == 0 || tf0Var.pnx5pC0XzaCw()) {
                p10.Companion.getClass();
                i3 = i2 & (-57345);
                j3 = 9205357640488583168L;
            } else {
                tf0Var.i68hK7ahKtgp();
                i3 = i2 & (-57345);
                j3 = j;
            }
            tf0Var.BRwzKIf41E4i();
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            iv1 iv1Var2 = iv1.OPXfSBeufaJ8;
            iv1 iv1Var3 = iv1.rtx2ld2ELZv4;
            if (z) {
                k32 k32Var = u22.PxuCJdSBwIXG;
                z3 = (iv1Var == iv1Var3 && !z2) || (iv1Var == iv1Var2 && z2);
            } else {
                k32 k32Var2 = u22.PxuCJdSBwIXG;
                z3 = (iv1Var != iv1Var3 || z2) && !(iv1Var == iv1Var2 && z2);
            }
            md mdVar = z3 ? lS5Rgt96tfkO : PxuCJdSBwIXG;
            int i4 = i3 & 14;
            boolean RAsUl2FVSrh62 = (i4 == 4 || ((i3 & 8) != 0 && tf0Var.rtx2ld2ELZv4(ef1Var))) | ((i3 & 112) == 32) | tf0Var.RAsUl2FVSrh6(z3);
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            if (!RAsUl2FVSrh62) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu = new le0() { // from class: s5
                @Override // defpackage.le0
                public final Object OPXfSBeufaJ8(Object obj) {
                    l32 l32Var = (l32) obj;
                    long PxuCJdSBwIXG2 = ef1.this.PxuCJdSBwIXG();
                    l32Var.PxuCJdSBwIXG(u22.PxuCJdSBwIXG, new t22(z ? ji0.OPXfSBeufaJ8 : ji0.wdg6QnbFHrFF, PxuCJdSBwIXG2, z3 ? s22.rtx2ld2ELZv4 : s22.wdg6QnbFHrFF, (9223372034707292159L & PxuCJdSBwIXG2) != 9205357640488583168L));
                    return no2.PxuCJdSBwIXG;
                }
            };
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
            final n61 PxuCJdSBwIXG2 = a32.PxuCJdSBwIXG(n61Var, (le0) nLZGh9p8gVSu);
            final vq2 vq2Var = (vq2) tf0Var.wdg6QnbFHrFF(eq.EcgxDIVH5in8);
            long j4 = j3;
            md mdVar2 = mdVar;
            j2 = j4;
            e9gEMXR7LXtO(ef1Var, mdVar2, bs0.kpCQ9veP6n3I(1365123137, new pe0() { // from class: t5
                @Override // defpackage.pe0
                public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
                    hp hpVar2 = (hp) obj;
                    int intValue = ((Integer) obj2).intValue();
                    tf0 tf0Var2 = (tf0) hpVar2;
                    if (tf0Var2.Pf0ThKz3j5YS(intValue & 1, (intValue & 3) != 2)) {
                        gg1 gg1Var2 = mp.PxuCJdSBwIXG;
                        ir1 PxuCJdSBwIXG3 = eq.EcgxDIVH5in8.PxuCJdSBwIXG(vq2.this);
                        final long j5 = j2;
                        final boolean z4 = z3;
                        final n61 n61Var2 = PxuCJdSBwIXG2;
                        final ef1 ef1Var2 = ef1Var;
                        zv.lS5Rgt96tfkO(PxuCJdSBwIXG3, bs0.kpCQ9veP6n3I(1260045569, new pe0() { // from class: v5
                            /* JADX WARN: Code restructure failed: missing block: B:17:0x00a9, code lost:
                            
                                if (r5 == r1) goto L22;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:28:0x00d5, code lost:
                            
                                if (r4 == r1) goto L28;
                             */
                            @Override // defpackage.pe0
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object rtx2ld2ELZv4(Object obj3, Object obj4) {
                                hp hpVar3 = (hp) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                final int i5 = 1;
                                final int i6 = 0;
                                tf0 tf0Var3 = (tf0) hpVar3;
                                if (tf0Var3.Pf0ThKz3j5YS(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    gg1 gg1Var3 = mp.PxuCJdSBwIXG;
                                    long j6 = j5;
                                    boolean z5 = z4;
                                    n61 n61Var3 = n61Var2;
                                    final ef1 ef1Var3 = ef1Var2;
                                    jx1 jx1Var = fp.lS5Rgt96tfkO;
                                    if (j6 != 9205357640488583168L) {
                                        tf0Var3.IXK6ba3ucyzm(3458246);
                                        v9 v9Var = z5 ? ov2.TSizfFm2Yiuu : ov2.lS5Rgt96tfkO;
                                        n61 e9gEMXR7LXtO2 = c62.e9gEMXR7LXtO(n61Var3, p10.lS5Rgt96tfkO(j6), p10.PxuCJdSBwIXG(j6), 0.0f, 0.0f, 12);
                                        s.Companion.getClass();
                                        by1 PxuCJdSBwIXG4 = ay1.PxuCJdSBwIXG(v9Var, r.dgRBjINgWbAK, tf0Var3, 0);
                                        int hashCode = Long.hashCode(tf0Var3.wLFCmsViZrNT);
                                        il1 x50lh2ztY7Y52 = tf0Var3.x50lh2ztY7Y5();
                                        n61 xfACYKDMU6Dj = ov2.xfACYKDMU6Dj(tf0Var3, e9gEMXR7LXtO2);
                                        yo.Companion.getClass();
                                        dq dqVar = xo.lS5Rgt96tfkO;
                                        tf0Var3.ngxnMNrpiKat();
                                        if (tf0Var3.zf8DYfih6EZu) {
                                            tf0Var3.dgRBjINgWbAK(dqVar);
                                        } else {
                                            tf0Var3.hVNtCUZb4tYH();
                                        }
                                        th0.tmVwIGCQF4zR(tf0Var3, xo.a92UlCVFR9N8, PxuCJdSBwIXG4);
                                        th0.tmVwIGCQF4zR(tf0Var3, xo.e9gEMXR7LXtO, x50lh2ztY7Y52);
                                        th0.tmVwIGCQF4zR(tf0Var3, xo.RAsUl2FVSrh6, Integer.valueOf(hashCode));
                                        th0.kpCQ9veP6n3I(tf0Var3, xo.rtx2ld2ELZv4);
                                        th0.tmVwIGCQF4zR(tf0Var3, xo.Y1f8riQaR6yg, xfACYKDMU6Dj);
                                        k61 k61Var = n61.Companion;
                                        boolean rtx2ld2ELZv42 = tf0Var3.rtx2ld2ELZv4(ef1Var3);
                                        Object nLZGh9p8gVSu2 = tf0Var3.nLZGh9p8gVSu();
                                        if (!rtx2ld2ELZv42) {
                                            hp.Companion.getClass();
                                        }
                                        nLZGh9p8gVSu2 = new ae0() { // from class: w5
                                            @Override // defpackage.ae0
                                            public final Object PxuCJdSBwIXG() {
                                                int i7 = i6;
                                                ef1 ef1Var4 = ef1Var3;
                                                switch (i7) {
                                                    case 0:
                                                        return Boolean.valueOf((9223372034707292159L & ef1Var4.PxuCJdSBwIXG()) != 9205357640488583168L);
                                                    default:
                                                        return Boolean.valueOf((9223372034707292159L & ef1Var4.PxuCJdSBwIXG()) != 9205357640488583168L);
                                                }
                                            }
                                        };
                                        tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu2);
                                        zv.RAsUl2FVSrh6(6, tf0Var3, (ae0) nLZGh9p8gVSu2, k61Var, z5);
                                        tf0Var3.gPXPFXrUH4XX(true);
                                        tf0Var3.gPXPFXrUH4XX(false);
                                    } else {
                                        tf0Var3.IXK6ba3ucyzm(4389176);
                                        boolean rtx2ld2ELZv43 = tf0Var3.rtx2ld2ELZv4(ef1Var3);
                                        Object nLZGh9p8gVSu3 = tf0Var3.nLZGh9p8gVSu();
                                        if (!rtx2ld2ELZv43) {
                                            hp.Companion.getClass();
                                        }
                                        nLZGh9p8gVSu3 = new ae0() { // from class: w5
                                            @Override // defpackage.ae0
                                            public final Object PxuCJdSBwIXG() {
                                                int i7 = i5;
                                                ef1 ef1Var4 = ef1Var3;
                                                switch (i7) {
                                                    case 0:
                                                        return Boolean.valueOf((9223372034707292159L & ef1Var4.PxuCJdSBwIXG()) != 9205357640488583168L);
                                                    default:
                                                        return Boolean.valueOf((9223372034707292159L & ef1Var4.PxuCJdSBwIXG()) != 9205357640488583168L);
                                                }
                                            }
                                        };
                                        tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu3);
                                        zv.RAsUl2FVSrh6(0, tf0Var3, (ae0) nLZGh9p8gVSu3, n61Var3, z5);
                                        tf0Var3.gPXPFXrUH4XX(false);
                                    }
                                } else {
                                    tf0Var3.i68hK7ahKtgp();
                                }
                                return no2.PxuCJdSBwIXG;
                            }
                        }, tf0Var2), tf0Var2, 56);
                    } else {
                        tf0Var2.i68hK7ahKtgp();
                    }
                    return no2.PxuCJdSBwIXG;
                }
            }, tf0Var), tf0Var, i4 | 384);
        } else {
            tf0Var.i68hK7ahKtgp();
            j2 = j;
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            final long j5 = j2;
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new pe0() { // from class: u5
                @Override // defpackage.pe0
                public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zv.a92UlCVFR9N8(ef1.this, z, iv1Var, z2, j5, f, n61Var, (hp) obj, ki0.bEKsvqmvPh2y(i | 1));
                    return no2.PxuCJdSBwIXG;
                }
            };
        }
    }

    public static final int aF05bpZJlKEP(ma maVar, Object obj, int i) {
        int i2 = maVar.wdg6QnbFHrFF;
        if (i2 == 0) {
            return -1;
        }
        try {
            int VhhvGxCb8gfr = mm2.VhhvGxCb8gfr(maVar.rtx2ld2ELZv4, i2, i);
            if (VhhvGxCb8gfr < 0 || cs0.wdg6QnbFHrFF(obj, maVar.OPXfSBeufaJ8[VhhvGxCb8gfr])) {
                return VhhvGxCb8gfr;
            }
            int i3 = VhhvGxCb8gfr + 1;
            while (i3 < i2 && maVar.rtx2ld2ELZv4[i3] == i) {
                if (cs0.wdg6QnbFHrFF(obj, maVar.OPXfSBeufaJ8[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = VhhvGxCb8gfr - 1; i4 >= 0 && maVar.rtx2ld2ELZv4[i4] == i; i4--) {
                if (cs0.wdg6QnbFHrFF(obj, maVar.OPXfSBeufaJ8[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static void amuv7NJvPxHu(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static n61 bEKsvqmvPh2y(n61 n61Var, q02 q02Var) {
        return n61Var.TSizfFm2Yiuu(hq0.BRwzKIf41E4i(n61.Companion, gk0.TSizfFm2Yiuu)).TSizfFm2Yiuu(new r02(null, null, q02Var.Y1f8riQaR6yg, th1.rtx2ld2ELZv4, q02Var, true, true)).TSizfFm2Yiuu(new f12(q02Var));
    }

    public static n61 cpQdD2nAriOS(lx0 lx0Var) {
        return lx0Var.TSizfFm2Yiuu(new oa());
    }

    public static final m61 dgRBjINgWbAK(f91 f91Var) {
        int i;
        if (f91Var == null || (i = f91Var.wdg6QnbFHrFF) == 0) {
            return null;
        }
        return (m61) f91Var.dgRBjINgWbAK(i - 1);
    }

    public static n61 e6tOsSdd2EFb(n61 n61Var, float f, float f2, float f3, z42 z42Var, int i) {
        float f4 = (i & 1) != 0 ? 1.0f : f;
        float f5 = (i & 2) != 0 ? 1.0f : f2;
        float f6 = (i & 4) != 0 ? 1.0f : f3;
        xk2.Companion.getClass();
        long j = xk2.lS5Rgt96tfkO;
        z42 z42Var2 = (i & 2048) != 0 ? b51.x50lh2ztY7Y5 : z42Var;
        boolean z = (i & 4096) == 0;
        long j2 = vh0.PxuCJdSBwIXG;
        sp.Companion.getClass();
        sd.Companion.getClass();
        return IAToe7bXGz4N(n61Var, f4, f5, f6, 0.0f, j, z42Var2, z, j2, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
    
        if (r1 == defpackage.fp.lS5Rgt96tfkO) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e9gEMXR7LXtO(ef1 ef1Var, s sVar, on onVar, hp hpVar, int i) {
        int i2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-1090171650);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? tf0Var.a92UlCVFR9N8(ef1Var) : tf0Var.rtx2ld2ELZv4(ef1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tf0Var.a92UlCVFR9N8(sVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tf0Var.rtx2ld2ELZv4(onVar) ? 256 : 128;
        }
        boolean z = true;
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 147) != 146)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !tf0Var.a92UlCVFR9N8(ef1Var))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            if (!z3) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu = new li0(sVar, ef1Var);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
            j5.PxuCJdSBwIXG((li0) nLZGh9p8gVSu, null, new ep1(false, m12.rtx2ld2ELZv4, false), onVar, tf0Var, ((i2 << 3) & 7168) | 384, 2);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new q5(ef1Var, sVar, onVar, i, 0);
        }
    }

    public static final void gGoUzNp9JO5I(tx txVar) {
        r0 r0Var;
        vw0 zf8DYfih6EZu = zf8DYfih6EZu(txVar);
        if (zf8DYfih6EZu.IAToe7bXGz4N) {
            return;
        }
        r1 r1Var = (r1) yw0.PxuCJdSBwIXG(zf8DYfih6EZu);
        if (!r1.RAsUl2FVSrh6() || (r0Var = r1Var.wLFCmsViZrNT) == null) {
            return;
        }
        r0Var.dgRBjINgWbAK.lS5Rgt96tfkO.RAsUl2FVSrh6(zf8DYfih6EZu.OPXfSBeufaJ8, new q0(r0Var, zf8DYfih6EZu));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r1 <= r6.getHeight()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ym0 gPXPFXrUH4XX(eh ehVar, float f) {
        int ceil = ((int) Math.ceil(f)) * 2;
        w3 w3Var = ki0.PxuCJdSBwIXG;
        t0 t0Var = ki0.lS5Rgt96tfkO;
        ji jiVar = ki0.TSizfFm2Yiuu;
        if (w3Var != null && t0Var != null) {
            Bitmap bitmap = w3Var.PxuCJdSBwIXG;
            if (ceil <= bitmap.getWidth()) {
            }
        }
        an0.Companion.getClass();
        w3Var = vi0.PxuCJdSBwIXG(ceil, ceil, 1);
        ki0.PxuCJdSBwIXG = w3Var;
        t0Var = PxuCJdSBwIXG(w3Var);
        ki0.lS5Rgt96tfkO = t0Var;
        w3 w3Var2 = w3Var;
        t0 t0Var2 = t0Var;
        if (jiVar == null) {
            jiVar = new ji();
            ki0.TSizfFm2Yiuu = jiVar;
        }
        ji jiVar2 = jiVar;
        ii iiVar = jiVar2.rtx2ld2ELZv4;
        cw0 layoutDirection = ehVar.rtx2ld2ELZv4.getLayoutDirection();
        Bitmap bitmap2 = w3Var2.PxuCJdSBwIXG;
        float width = bitmap2.getWidth();
        float height = bitmap2.getHeight();
        hy hyVar = iiVar.PxuCJdSBwIXG;
        cw0 cw0Var = iiVar.lS5Rgt96tfkO;
        gi giVar = iiVar.TSizfFm2Yiuu;
        long j = iiVar.Y1f8riQaR6yg;
        iiVar.PxuCJdSBwIXG = ehVar;
        iiVar.lS5Rgt96tfkO = layoutDirection;
        iiVar.TSizfFm2Yiuu = t0Var2;
        iiVar.Y1f8riQaR6yg = (Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(height) & 4294967295L);
        t0Var2.wdg6QnbFHrFF();
        hl.Companion.getClass();
        long j2 = hl.lS5Rgt96tfkO;
        long Y1f8riQaR6yg2 = jiVar2.Y1f8riQaR6yg();
        sd.Companion.getClass();
        k30.ozEBbv0hFTAB(jiVar2, j2, Y1f8riQaR6yg2, 58);
        long Y1f8riQaR6yg3 = mm2.Y1f8riQaR6yg(4278190080L);
        bf1.Companion.getClass();
        k30.ozEBbv0hFTAB(jiVar2, Y1f8riQaR6yg3, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), 120);
        k30.KUoIVIumpKat(jiVar2, mm2.Y1f8riQaR6yg(4278190080L), f, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), 120);
        t0Var2.RAsUl2FVSrh6();
        iiVar.PxuCJdSBwIXG = hyVar;
        iiVar.lS5Rgt96tfkO = cw0Var;
        iiVar.TSizfFm2Yiuu = giVar;
        iiVar.Y1f8riQaR6yg = j;
        return w3Var2;
    }

    public static final pd1 i68hK7ahKtgp(tx txVar) {
        if (!((m61) txVar).rtx2ld2ELZv4.S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        pd1 POWyO8hTM6YC = POWyO8hTM6YC(txVar, 2);
        if (!POWyO8hTM6YC.kRWHK87H9qm4().S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("LayoutCoordinates is not attached.");
        }
        return POWyO8hTM6YC;
    }

    public static final boolean jyegZNwi31qc(ht0 ht0Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        ht0Var.getClass();
        if (ht0Var.PxuCJdSBwIXG.PxuCJdSBwIXG) {
            return true;
        }
        List annotations = serialDescriptor.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof st0) {
                return true;
            }
        }
        return false;
    }

    public static final n61 kpCQ9veP6n3I(int i, hp hpVar, ae0 ae0Var, n61 n61Var, boolean z) {
        n61Var.getClass();
        ae0Var.getClass();
        if ((i & 1) != 0) {
            z = true;
        }
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        tf0 tf0Var = (tf0) hpVar;
        Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
        hp.Companion.getClass();
        if (nLZGh9p8gVSu == fp.lS5Rgt96tfkO) {
            nLZGh9p8gVSu = new e81();
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
        }
        return fx1.IAToe7bXGz4N(n61Var, (e81) nLZGh9p8gVSu, null, z, ae0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void lS5Rgt96tfkO(ir1 ir1Var, pe0 pe0Var, hp hpVar, int i) {
        jp2 jp2Var;
        boolean z;
        zs1 XL4ISE6Oc65B2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-149765515);
        jr0 jr0Var = tf0Var.ZbWwgt3aGe7A;
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        il1 x50lh2ztY7Y52 = tf0Var.x50lh2ztY7Y5();
        tf0Var.xbgXKYA2cIfu(201, mp.lS5Rgt96tfkO);
        Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
        hp.Companion.getClass();
        if (cs0.wdg6QnbFHrFF(nLZGh9p8gVSu, fp.lS5Rgt96tfkO)) {
            jp2Var = null;
        } else {
            nLZGh9p8gVSu.getClass();
            jp2Var = (jp2) nLZGh9p8gVSu;
        }
        gr1 gr1Var = ir1Var.PxuCJdSBwIXG;
        jp2 TSizfFm2Yiuu2 = gr1Var.TSizfFm2Yiuu(ir1Var, jp2Var);
        boolean equals = TSizfFm2Yiuu2.equals(jp2Var);
        if (!equals) {
            tf0Var.JTxCbbCwomzt(TSizfFm2Yiuu2);
        }
        int i2 = 1;
        if (tf0Var.zf8DYfih6EZu) {
            if (ir1Var.a92UlCVFR9N8 || !x50lh2ztY7Y52.containsKey(gr1Var)) {
                x50lh2ztY7Y52 = x50lh2ztY7Y52.lS5Rgt96tfkO(gr1Var, TSizfFm2Yiuu2);
            }
            tf0Var.EpkonXwzFgDB = true;
        } else {
            z62 z62Var = tf0Var.ozEBbv0hFTAB;
            Object lS5Rgt96tfkO2 = z62Var.lS5Rgt96tfkO(z62Var.lS5Rgt96tfkO, z62Var.RAsUl2FVSrh6);
            lS5Rgt96tfkO2.getClass();
            il1 il1Var = (il1) lS5Rgt96tfkO2;
            if (!(tf0Var.e6tOsSdd2EFb() && equals) && (ir1Var.a92UlCVFR9N8 || !x50lh2ztY7Y52.containsKey(gr1Var))) {
                x50lh2ztY7Y52 = x50lh2ztY7Y52.lS5Rgt96tfkO(gr1Var, TSizfFm2Yiuu2);
            } else if ((equals && !tf0Var.S2OOm9zPNm0h) || !tf0Var.S2OOm9zPNm0h) {
                x50lh2ztY7Y52 = il1Var;
            }
            if (tf0Var.pnx5pC0XzaCw || il1Var != x50lh2ztY7Y52) {
                z = true;
                if (z && !tf0Var.zf8DYfih6EZu) {
                    tf0Var.EpkonXwzFgDB(x50lh2ztY7Y52);
                }
                jr0Var.TSizfFm2Yiuu(tf0Var.S2OOm9zPNm0h ? 1 : 0);
                tf0Var.S2OOm9zPNm0h = z;
                tf0Var.xfACYKDMU6Dj = x50lh2ztY7Y52;
                gg1 gg1Var2 = mp.TSizfFm2Yiuu;
                hi0.Companion.getClass();
                tf0Var.zf8DYfih6EZu(202, 0, gg1Var2, x50lh2ztY7Y52);
                pe0Var.rtx2ld2ELZv4(tf0Var, Integer.valueOf((i >> 3) & 14));
                tf0Var.gPXPFXrUH4XX(false);
                tf0Var.gPXPFXrUH4XX(false);
                tf0Var.S2OOm9zPNm0h = jr0Var.lS5Rgt96tfkO() != 0;
                tf0Var.xfACYKDMU6Dj = null;
                XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
                if (XL4ISE6Oc65B2 == null) {
                    XL4ISE6Oc65B2.Y1f8riQaR6yg = new ln(i, i2, ir1Var, pe0Var);
                    return;
                }
                return;
            }
        }
        z = false;
        if (z) {
            tf0Var.EpkonXwzFgDB(x50lh2ztY7Y52);
        }
        jr0Var.TSizfFm2Yiuu(tf0Var.S2OOm9zPNm0h ? 1 : 0);
        tf0Var.S2OOm9zPNm0h = z;
        tf0Var.xfACYKDMU6Dj = x50lh2ztY7Y52;
        gg1 gg1Var22 = mp.TSizfFm2Yiuu;
        hi0.Companion.getClass();
        tf0Var.zf8DYfih6EZu(202, 0, gg1Var22, x50lh2ztY7Y52);
        pe0Var.rtx2ld2ELZv4(tf0Var, Integer.valueOf((i >> 3) & 14));
        tf0Var.gPXPFXrUH4XX(false);
        tf0Var.gPXPFXrUH4XX(false);
        tf0Var.S2OOm9zPNm0h = jr0Var.lS5Rgt96tfkO() != 0;
        tf0Var.xfACYKDMU6Dj = null;
        XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 == null) {
        }
    }

    public static final hu nLZGh9p8gVSu(ru ruVar, hu huVar) {
        hu RfyTYNmI9Srp = RfyTYNmI9Srp(ruVar.cpQdD2nAriOS(), huVar, true);
        yw ywVar = j00.PxuCJdSBwIXG;
        return (RfyTYNmI9Srp == ywVar || RfyTYNmI9Srp.S2OOm9zPNm0h(ih0.x50lh2ztY7Y5) != null) ? RfyTYNmI9Srp : RfyTYNmI9Srp.RfyTYNmI9Srp(ywVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void ngxnMNrpiKat(Context context, Executor executor, rq1 rq1Var, boolean z) {
        boolean z2;
        ?? r7;
        gz[] gzVarArr;
        gz[] gzVarArr2;
        gz[] gzVarArr3;
        byte[] bArr;
        boolean z3;
        boolean z4;
        Throwable th;
        Throwable th2;
        boolean z5;
        boolean z6;
        ?? r72;
        boolean z7;
        fz fzVar;
        boolean z8;
        FileInputStream PxuCJdSBwIXG2;
        boolean z9;
        boolean z10;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z10 = readLong == packageInfo.lastUpdateTime;
                            if (z10) {
                                rq1Var.wdg6QnbFHrFF(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z10) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        vq1.TSizfFm2Yiuu(context, false);
                        return;
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr2 = hq0.r3s1LDPKFs1S;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            fz fzVar2 = new fz(assets, executor, rq1Var, name, file2);
            byte[] bArr3 = fzVar2.TSizfFm2Yiuu;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        fzVar2.lS5Rgt96tfkO(4, null);
                    }
                    fzVar2.a92UlCVFR9N8 = true;
                    try {
                        try {
                            r7 = fzVar2.PxuCJdSBwIXG(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e) {
                            rq1Var.wdg6QnbFHrFF(6, e);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            gzVarArr2 = fzVar2.RAsUl2FVSrh6;
                            if (gzVarArr2 != null) {
                            }
                            rq1 rq1Var2 = fzVar2.lS5Rgt96tfkO;
                            gzVarArr3 = fzVar2.RAsUl2FVSrh6;
                            byte[] bArr4 = fzVar2.TSizfFm2Yiuu;
                            boolean z11 = r7;
                            z11 = r7;
                            if (gzVarArr3 != null) {
                            }
                            bArr = fzVar2.rtx2ld2ELZv4;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            vq1.TSizfFm2Yiuu(context, (z6 || !z) ? false : z9);
                        } catch (IOException e2) {
                            rq1Var.wdg6QnbFHrFF(7, e2);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            gzVarArr2 = fzVar2.RAsUl2FVSrh6;
                            if (gzVarArr2 != null) {
                            }
                            rq1 rq1Var22 = fzVar2.lS5Rgt96tfkO;
                            gzVarArr3 = fzVar2.RAsUl2FVSrh6;
                            byte[] bArr42 = fzVar2.TSizfFm2Yiuu;
                            boolean z112 = r7;
                            z112 = r7;
                            if (gzVarArr3 != null) {
                            }
                            bArr = fzVar2.rtx2ld2ELZv4;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            vq1.TSizfFm2Yiuu(context, (z6 || !z) ? false : z9);
                        }
                        if (r7 != 0) {
                            try {
                                try {
                                } catch (IllegalStateException e3) {
                                    rq1Var.wdg6QnbFHrFF(8, e3);
                                    try {
                                        r7.close();
                                    } catch (IOException e4) {
                                        rq1Var.wdg6QnbFHrFF(7, e4);
                                    }
                                    gzVarArr = null;
                                    fzVar2.RAsUl2FVSrh6 = gzVarArr;
                                    gzVarArr2 = fzVar2.RAsUl2FVSrh6;
                                    if (gzVarArr2 != null) {
                                    }
                                    rq1 rq1Var222 = fzVar2.lS5Rgt96tfkO;
                                    gzVarArr3 = fzVar2.RAsUl2FVSrh6;
                                    byte[] bArr422 = fzVar2.TSizfFm2Yiuu;
                                    boolean z1122 = r7;
                                    z1122 = r7;
                                    if (gzVarArr3 != null) {
                                    }
                                    bArr = fzVar2.rtx2ld2ELZv4;
                                    if (bArr != null) {
                                    }
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    vq1.TSizfFm2Yiuu(context, (z6 || !z) ? false : z9);
                                }
                            } catch (IOException e5) {
                                rq1Var.wdg6QnbFHrFF(7, e5);
                                r7.close();
                                gzVarArr = null;
                                fzVar2.RAsUl2FVSrh6 = gzVarArr;
                                gzVarArr2 = fzVar2.RAsUl2FVSrh6;
                                if (gzVarArr2 != null) {
                                }
                                rq1 rq1Var2222 = fzVar2.lS5Rgt96tfkO;
                                gzVarArr3 = fzVar2.RAsUl2FVSrh6;
                                byte[] bArr4222 = fzVar2.TSizfFm2Yiuu;
                                boolean z11222 = r7;
                                z11222 = r7;
                                if (gzVarArr3 != null) {
                                }
                                bArr = fzVar2.rtx2ld2ELZv4;
                                if (bArr != null) {
                                }
                                if (z4) {
                                }
                                z6 = z4;
                                z9 = z5;
                                vq1.TSizfFm2Yiuu(context, (z6 || !z) ? false : z9);
                            }
                            if (!Arrays.equals(bArr2, fx1.v6yxfmkxNKhL(r7, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            gzVarArr = hq0.xfACYKDMU6Dj(r7, fx1.v6yxfmkxNKhL(r7, 4), fzVar2.e9gEMXR7LXtO);
                            try {
                                r7.close();
                            } catch (IOException e6) {
                                rq1Var.wdg6QnbFHrFF(7, e6);
                            }
                            fzVar2.RAsUl2FVSrh6 = gzVarArr;
                        }
                        gzVarArr2 = fzVar2.RAsUl2FVSrh6;
                        if (gzVarArr2 != null && ((r7 = Build.VERSION.SDK_INT) >= 31 || r7 == 24 || r7 == 25)) {
                            try {
                                r7 = "dexopt/baseline.profm";
                                PxuCJdSBwIXG2 = fzVar2.PxuCJdSBwIXG(assets, "dexopt/baseline.profm");
                                z8 = r7;
                            } catch (FileNotFoundException e7) {
                                rq1Var.wdg6QnbFHrFF(9, e7);
                                z8 = r7;
                            } catch (IOException e8) {
                                rq1Var.wdg6QnbFHrFF(7, e8);
                                z8 = r7;
                            } catch (IllegalStateException e9) {
                                fzVar2.RAsUl2FVSrh6 = null;
                                rq1Var.wdg6QnbFHrFF(8, e9);
                                z8 = r7;
                            }
                            if (PxuCJdSBwIXG2 == null) {
                                try {
                                    if (!Arrays.equals(hq0.QrzZRwfaDlRX, fx1.v6yxfmkxNKhL(PxuCJdSBwIXG2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] v6yxfmkxNKhL = fx1.v6yxfmkxNKhL(PxuCJdSBwIXG2, 4);
                                    fzVar2.RAsUl2FVSrh6 = hq0.tmVwIGCQF4zR(PxuCJdSBwIXG2, v6yxfmkxNKhL, bArr3, gzVarArr2);
                                    PxuCJdSBwIXG2.close();
                                    fzVar = fzVar2;
                                    r7 = v6yxfmkxNKhL;
                                    if (fzVar != null) {
                                        fzVar2 = fzVar;
                                    }
                                } finally {
                                }
                            } else {
                                if (PxuCJdSBwIXG2 != null) {
                                    PxuCJdSBwIXG2.close();
                                    z8 = r7;
                                }
                                fzVar = null;
                                r7 = z8;
                                if (fzVar != null) {
                                }
                            }
                        }
                        rq1 rq1Var22222 = fzVar2.lS5Rgt96tfkO;
                        gzVarArr3 = fzVar2.RAsUl2FVSrh6;
                        byte[] bArr42222 = fzVar2.TSizfFm2Yiuu;
                        boolean z112222 = r7;
                        z112222 = r7;
                        if (gzVarArr3 != null && bArr42222 != null) {
                            r72 = fzVar2.a92UlCVFR9N8;
                            if (r72 != 0) {
                                u9.rtx2ld2ELZv4("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                r72 = new ByteArrayOutputStream();
                                try {
                                    r72.write(bArr2);
                                    r72.write(bArr42222);
                                } finally {
                                }
                            } catch (IOException e10) {
                                rq1Var22222.wdg6QnbFHrFF(7, e10);
                                z7 = r72;
                            } catch (IllegalStateException e11) {
                                rq1Var22222.wdg6QnbFHrFF(8, e11);
                                z7 = r72;
                            }
                            if (hq0.nxJAScVArhE9(r72, bArr42222, gzVarArr3)) {
                                fzVar2.rtx2ld2ELZv4 = r72.toByteArray();
                                r72.close();
                                z7 = r72;
                                fzVar2.RAsUl2FVSrh6 = null;
                                z112222 = z7;
                            } else {
                                rq1Var22222.wdg6QnbFHrFF(5, null);
                                fzVar2.RAsUl2FVSrh6 = null;
                                r72.close();
                                z112222 = r72;
                            }
                        }
                        bArr = fzVar2.rtx2ld2ELZv4;
                        if (bArr != null) {
                            z4 = false;
                            z5 = true;
                        } else {
                            try {
                                if (!fzVar2.a92UlCVFR9N8) {
                                    u9.rtx2ld2ELZv4("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(fzVar2.Y1f8riQaR6yg);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock tryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (tryLock != null) {
                                                                        try {
                                                                            if (tryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int read = byteArrayInputStream.read(bArr5);
                                                                                    if (read <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, read);
                                                                                    }
                                                                                }
                                                                                z5 = true;
                                                                                fzVar2.lS5Rgt96tfkO(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                fzVar2.rtx2ld2ELZv4 = null;
                                                                                fzVar2.RAsUl2FVSrh6 = null;
                                                                                z4 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (tryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                tryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th12) {
                                                            th2.addSuppressed(th12);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e12) {
                                        e = e12;
                                        fzVar2.lS5Rgt96tfkO(6, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        vq1.TSizfFm2Yiuu(context, (z6 || !z) ? false : z9);
                                    } catch (IOException e13) {
                                        e = e13;
                                        fzVar2.lS5Rgt96tfkO(7, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        vq1.TSizfFm2Yiuu(context, (z6 || !z) ? false : z9);
                                    }
                                } catch (FileNotFoundException e14) {
                                    e = e14;
                                    z112222 = true;
                                    fzVar2.lS5Rgt96tfkO(6, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    vq1.TSizfFm2Yiuu(context, (z6 || !z) ? false : z9);
                                } catch (IOException e15) {
                                    e = e15;
                                    z112222 = true;
                                    fzVar2.lS5Rgt96tfkO(7, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    vq1.TSizfFm2Yiuu(context, (z6 || !z) ? false : z9);
                                }
                            } finally {
                                fzVar2.rtx2ld2ELZv4 = null;
                                fzVar2.RAsUl2FVSrh6 = null;
                            }
                        }
                        if (z4) {
                            amuv7NJvPxHu(packageInfo, filesDir);
                        }
                        z6 = z4;
                        z9 = z5;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            fzVar2.lS5Rgt96tfkO(4, null);
                        }
                        fzVar2.a92UlCVFR9N8 = true;
                        r7 = fzVar2.PxuCJdSBwIXG(assets, "dexopt/baseline.prof");
                        if (r7 != 0) {
                        }
                        gzVarArr2 = fzVar2.RAsUl2FVSrh6;
                        if (gzVarArr2 != null) {
                            r7 = "dexopt/baseline.profm";
                            PxuCJdSBwIXG2 = fzVar2.PxuCJdSBwIXG(assets, "dexopt/baseline.profm");
                            z8 = r7;
                            if (PxuCJdSBwIXG2 == null) {
                            }
                        }
                        rq1 rq1Var222222 = fzVar2.lS5Rgt96tfkO;
                        gzVarArr3 = fzVar2.RAsUl2FVSrh6;
                        byte[] bArr422222 = fzVar2.TSizfFm2Yiuu;
                        boolean z1122222 = r7;
                        z1122222 = r7;
                        if (gzVarArr3 != null) {
                            r72 = fzVar2.a92UlCVFR9N8;
                            if (r72 != 0) {
                            }
                        }
                        bArr = fzVar2.rtx2ld2ELZv4;
                        if (bArr != null) {
                        }
                        if (z4) {
                        }
                        z6 = z4;
                        z9 = z5;
                    } catch (IOException unused2) {
                        z2 = true;
                        fzVar2.lS5Rgt96tfkO(4, null);
                    }
                }
                vq1.TSizfFm2Yiuu(context, (z6 || !z) ? false : z9);
            }
            fzVar2.lS5Rgt96tfkO(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z6 = false;
            z9 = z2;
            vq1.TSizfFm2Yiuu(context, (z6 || !z) ? false : z9);
        } catch (PackageManager.NameNotFoundException e16) {
            rq1Var.wdg6QnbFHrFF(7, e16);
            vq1.TSizfFm2Yiuu(context, false);
        }
    }

    public static final String nxJAScVArhE9(bt btVar) {
        Object uv1Var;
        if (btVar instanceof e00) {
            return ((e00) btVar).toString();
        }
        try {
            uv1Var = btVar + '@' + VhhvGxCb8gfr(btVar);
        } catch (Throwable th) {
            uv1Var = new uv1(th);
        }
        if (vv1.PxuCJdSBwIXG(uv1Var) != null) {
            uv1Var = btVar.getClass().getName() + '@' + VhhvGxCb8gfr(btVar);
        }
        return (String) uv1Var;
    }

    public static final boolean ozEBbv0hFTAB(long j) {
        return (j & 2) != 0;
    }

    public static final n61 pnx5pC0XzaCw(n61 n61Var, le0 le0Var) {
        return n61Var.TSizfFm2Yiuu(new ud(le0Var));
    }

    public static final int r3s1LDPKFs1S(long j, long j2) {
        boolean tmVwIGCQF4zR = tmVwIGCQF4zR(j);
        if (tmVwIGCQF4zR != tmVwIGCQF4zR(j2)) {
            return tmVwIGCQF4zR ? -1 : 1;
        }
        return (Math.min(S9EYkSpbGuxq(j), S9EYkSpbGuxq(j2)) >= 0.0f && ozEBbv0hFTAB(j) != ozEBbv0hFTAB(j2)) ? ozEBbv0hFTAB(j) ? -1 : 1 : (int) Math.signum(S9EYkSpbGuxq(j) - S9EYkSpbGuxq(j2));
    }

    public static final void rZjpSjn4zoMv(tf0 tf0Var, pe0 pe0Var) {
        pe0Var.getClass();
        mm2.S9EYkSpbGuxq(2, pe0Var);
        pe0Var.rtx2ld2ELZv4(tf0Var, 1);
    }

    public static final void rtx2ld2ELZv4(n61 n61Var, pe0 pe0Var, hp hpVar, int i) {
        int i2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(1090521195);
        if ((i & 6) == 0) {
            i2 = (tf0Var.a92UlCVFR9N8(n61Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tf0Var.rtx2ld2ELZv4(pe0Var) ? 32 : 16;
        }
        int i3 = 0;
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 19) != 18)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            hp.Companion.getClass();
            if (nLZGh9p8gVSu == fp.lS5Rgt96tfkO) {
                nLZGh9p8gVSu = c3.lS5Rgt96tfkO;
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
            }
            j51 j51Var = (j51) nLZGh9p8gVSu;
            int hashCode = Long.hashCode(tf0Var.wLFCmsViZrNT);
            il1 x50lh2ztY7Y52 = tf0Var.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj = ov2.xfACYKDMU6Dj(tf0Var, n61Var);
            yo.Companion.getClass();
            dq dqVar = xo.lS5Rgt96tfkO;
            int i4 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            tf0Var.ngxnMNrpiKat();
            if (tf0Var.zf8DYfih6EZu) {
                tf0Var.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var.hVNtCUZb4tYH();
            }
            th0.tmVwIGCQF4zR(tf0Var, xo.a92UlCVFR9N8, j51Var);
            th0.tmVwIGCQF4zR(tf0Var, xo.e9gEMXR7LXtO, x50lh2ztY7Y52);
            th0.tmVwIGCQF4zR(tf0Var, xo.RAsUl2FVSrh6, Integer.valueOf(hashCode));
            th0.kpCQ9veP6n3I(tf0Var, xo.rtx2ld2ELZv4);
            th0.tmVwIGCQF4zR(tf0Var, xo.Y1f8riQaR6yg, xfACYKDMU6Dj);
            pe0Var.rtx2ld2ELZv4(tf0Var, Integer.valueOf((i4 >> 6) & 14));
            tf0Var.gPXPFXrUH4XX(true);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new d3(n61Var, pe0Var, i, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0264  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long ryVscX7ZL4Ux(int i, int i2, String str) {
        char c;
        int i3;
        long j;
        char c2;
        char c3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j2;
        char c4;
        int i9;
        int i10;
        int i11;
        int i12;
        long j3 = 4294967295L;
        if (i == i2) {
            return (i << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
        }
        char charAt = str.charAt(i);
        boolean z = charAt == '-';
        if (z) {
            i3 = i + 1;
            if (i3 == i2) {
                return (i3 << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
            }
            c = str.charAt(i3);
            if (((char) (c - '0')) >= '\n' && c != '.') {
                return (i3 << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
            }
        } else {
            c = charAt;
            i3 = i;
        }
        int length = str.length();
        int i13 = i3;
        long j4 = 0;
        while (true) {
            if (i13 == i2) {
                j = j3;
                break;
            }
            j = j3;
            int i14 = c - '0';
            if (((char) i14) >= '\n') {
                break;
            }
            j4 = (j4 * 10) + i14;
            i13++;
            c = i13 < length ? str.charAt(i13) : (char) 0;
            j3 = j;
        }
        int i15 = i13 - i3;
        char c5 = '0';
        if (i13 == i2 || c != '.') {
            c2 = ' ';
            c3 = 1;
            i4 = i13;
            i5 = i4;
            i6 = 0;
        } else {
            int i16 = i13 + 1;
            c2 = ' ';
            i4 = i16;
            while (true) {
                c3 = 1;
                if (i2 - i4 < 4) {
                    i12 = i16;
                    break;
                }
                i12 = i16;
                long charAt2 = str.charAt(i4) | (str.charAt(i4 + 1) << 16) | (str.charAt(i4 + 2) << 32) | (str.charAt(i4 + 3) << 48);
                long j5 = charAt2 - 13511005043687472L;
                int i17 = (((charAt2 + 19703549022044230L) | j5) & (-35747867511423104L)) != 0 ? -1 : (int) ((j5 * 281475406208040961L) >>> 48);
                if (i17 < 0) {
                    break;
                }
                j4 = (j4 * 10000) + i17;
                i4 += 4;
                i16 = i12;
            }
            char charAt3 = i4 < length ? str.charAt(i4) : (char) 0;
            loop2: while (true) {
                c = charAt3;
                while (i4 != i2) {
                    int i18 = c - '0';
                    if (((char) i18) >= '\n') {
                        break loop2;
                    }
                    j4 = (j4 * 10) + i18;
                    i4++;
                    if (i4 < length) {
                        break;
                    }
                    c = 0;
                }
                charAt3 = str.charAt(i4);
            }
            i6 = i12 - i4;
            i15 -= i6;
            i5 = i12;
        }
        if (i15 == 0) {
            return (i4 << c2) | (Float.floatToRawIntBits(Float.NaN) & j);
        }
        if ((c | ' ') == 101) {
            i7 = i4 + 1;
            char charAt4 = i7 < length ? str.charAt(i7) : (char) 0;
            char c6 = charAt4 == '-' ? c3 : (char) 0;
            if (c6 != 0 || charAt4 == '+') {
                i7 = i4 + 2;
            }
            char charAt5 = str.charAt(i7);
            i8 = 0;
            while (true) {
                if (i7 == i2) {
                    i11 = i6;
                    break;
                }
                int i19 = charAt5 - c5;
                i11 = i6;
                if (((char) i19) >= '\n') {
                    break;
                }
                if (i8 < 1024) {
                    i8 = (i8 * 10) + i19;
                }
                i7++;
                charAt5 = i7 < length ? str.charAt(i7) : (char) 0;
                i6 = i11;
                c5 = '0';
            }
            if (c6 != 0) {
                i8 = -i8;
            }
            i6 = i11 + i8;
        } else {
            i7 = i4;
            i8 = 0;
        }
        int i20 = 19;
        if (i15 > 19) {
            char charAt6 = str.charAt(i3);
            int i21 = i3;
            while (true) {
                if (i7 == i2) {
                    i9 = i20;
                    break;
                }
                if (charAt6 != '0' && charAt6 != '.') {
                    i9 = 19;
                    break;
                }
                if (charAt6 == '0') {
                    i15--;
                }
                i21++;
                charAt6 = i21 < length ? str.charAt(i21) : (char) 0;
                i20 = 19;
            }
            if (i15 > i9) {
                char charAt7 = str.charAt(i3);
                long j6 = 0;
                while (true) {
                    i10 = i3;
                    if (i3 == i13 || Long.compare(j6 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                        break;
                    }
                    j6 = (j6 * 10) + (charAt7 - '0');
                    i3 = i10 + 1;
                    charAt7 = i3 < length ? str.charAt(i3) : (char) 0;
                }
                if (Long.compare(j6 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                    i6 = (i13 - i10) + i8;
                } else {
                    char charAt8 = str.charAt(i5);
                    int i22 = i5;
                    while (i22 != i4 && Long.compare(j6 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                        j6 = (j6 * 10) + (charAt8 - '0');
                        i22++;
                        charAt8 = i22 < length ? str.charAt(i22) : (char) 0;
                    }
                    i6 = (i5 - i22) + i8;
                }
                j2 = j6;
                c4 = c3;
                if (-10 > i6 && i6 < 11 && c4 == 0 && Long.compare(j2 ^ Long.MIN_VALUE, -9223372036837998592L) <= 0) {
                    float f = j2;
                    float[] fArr = OPXfSBeufaJ8;
                    float f2 = i6 < 0 ? f / fArr[-i6] : f * fArr[i6];
                    if (z) {
                        f2 = -f2;
                    }
                    return (i7 << c2) | (Float.floatToRawIntBits(f2) & j);
                }
                if (j2 != 0) {
                    return (i7 << c2) | (Float.floatToRawIntBits(z ? -0.0f : 0.0f) & j);
                }
                if (-126 > i6 || i6 >= 128) {
                    return (i7 << c2) | (Float.floatToRawIntBits(Float.parseFloat(str.substring(i, i7))) & j);
                }
                long j7 = wdg6QnbFHrFF[i6 + 325];
                int numberOfLeadingZeros = Long.numberOfLeadingZeros(j2);
                long j8 = j2 << numberOfLeadingZeros;
                long j9 = j8 & j;
                long j10 = j8 >>> c2;
                long j11 = j7 & j;
                long j12 = j7 >>> c2;
                long j13 = j10 * j12;
                long j14 = j12 * j9;
                long j15 = j13 + ((((j10 * j11) + ((j9 * j11) >>> c2)) + (j14 & j)) >>> c2) + (j14 >>> c2);
                int i23 = (int) (j15 >>> 63);
                long j16 = j15 >>> (i23 + 9);
                int i24 = numberOfLeadingZeros + (i23 ^ 1);
                long j17 = j15 & 511;
                if (j17 == 511 || (j17 == 0 && (3 & j16) == 1)) {
                    return (i7 << c2) | (Float.floatToRawIntBits(Float.parseFloat(str.substring(i, i7))) & j);
                }
                long j18 = (j16 + 1) >>> c3;
                if (j18 >= 9007199254740992L) {
                    i24--;
                    j18 = 4503599627370496L;
                }
                long j19 = j18 & (-4503599627370497L);
                long j20 = (((i6 * 217706) >> 16) + 1087) - i24;
                if (j20 < 1 || j20 > 2046) {
                    return (i7 << c2) | (Float.floatToRawIntBits(Float.parseFloat(str.substring(i, i7))) & j);
                }
                return (i7 << c2) | (Float.floatToRawIntBits((float) Double.longBitsToDouble((j20 << 52) | j19 | (z ? Long.MIN_VALUE : 0L))) & j);
            }
        }
        j2 = j4;
        c4 = 0;
        if (-10 > i6) {
        }
        if (j2 != 0) {
        }
    }

    public static final boolean tmVwIGCQF4zR(long j) {
        return (j & 1) != 0;
    }

    public static final ei1 wLFCmsViZrNT(tx txVar) {
        ei1 ei1Var = zf8DYfih6EZu(txVar).S9EYkSpbGuxq;
        if (ei1Var != null) {
            return ei1Var;
        }
        throw o0.a92UlCVFR9N8("This node does not have an owner.");
    }

    public static final void wdg6QnbFHrFF(s82 s82Var) {
        int i = s82Var.dgRBjINgWbAK;
        int[] iArr = s82Var.OPXfSBeufaJ8;
        Object[] objArr = s82Var.wdg6QnbFHrFF;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != r3s1LDPKFs1S) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        s82Var.rtx2ld2ELZv4 = false;
        s82Var.dgRBjINgWbAK = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final kw0 x50lh2ztY7Y5(m61 m61Var) {
        if ((m61Var.wdg6QnbFHrFF & 2) != 0) {
            if (m61Var instanceof kw0) {
                return (kw0) m61Var;
            }
            if (m61Var instanceof ux) {
                m61 m61Var2 = ((ux) m61Var).S2OOm9zPNm0h;
                while (m61Var2 != 0) {
                    if (m61Var2 instanceof kw0) {
                        return (kw0) m61Var2;
                    }
                    m61Var2 = (!(m61Var2 instanceof ux) || (m61Var2.wdg6QnbFHrFF & 2) == 0) ? m61Var2.cpQdD2nAriOS : ((ux) m61Var2).S2OOm9zPNm0h;
                }
            }
        }
        return null;
    }

    public static final Object xbgXKYA2cIfu(ab0 ab0Var, int i, le0 le0Var) {
        int i2;
        int i3;
        Object obj;
        m61 m61Var;
        wx0 MDTGUQSX7PXD;
        int size;
        int i4;
        kd1 kd1Var;
        if (!ab0Var.rtx2ld2ELZv4.S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("visitAncestors called on an unattached node");
        }
        m61 m61Var2 = ab0Var.rtx2ld2ELZv4.x50lh2ztY7Y5;
        vw0 zf8DYfih6EZu = zf8DYfih6EZu(ab0Var);
        loop0: while (true) {
            i2 = 0;
            i3 = 1;
            obj = null;
            if (zf8DYfih6EZu == null) {
                m61Var = null;
                break;
            }
            if ((zf8DYfih6EZu.nLZGh9p8gVSu.a92UlCVFR9N8.dgRBjINgWbAK & 1024) != 0) {
                while (m61Var2 != null) {
                    if ((m61Var2.wdg6QnbFHrFF & 1024) != 0) {
                        m61Var = m61Var2;
                        f91 f91Var = null;
                        while (m61Var != null) {
                            if (m61Var instanceof ab0) {
                                break loop0;
                            }
                            if ((m61Var.wdg6QnbFHrFF & 1024) != 0 && (m61Var instanceof ux)) {
                                int i5 = 0;
                                for (m61 m61Var3 = ((ux) m61Var).S2OOm9zPNm0h; m61Var3 != null; m61Var3 = m61Var3.cpQdD2nAriOS) {
                                    if ((m61Var3.wdg6QnbFHrFF & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            m61Var = m61Var3;
                                        } else {
                                            if (f91Var == null) {
                                                f91Var = new f91(new m61[16]);
                                            }
                                            if (m61Var != null) {
                                                f91Var.lS5Rgt96tfkO(m61Var);
                                                m61Var = null;
                                            }
                                            f91Var.lS5Rgt96tfkO(m61Var3);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            m61Var = dgRBjINgWbAK(f91Var);
                        }
                    }
                    m61Var2 = m61Var2.x50lh2ztY7Y5;
                }
            }
            zf8DYfih6EZu = zf8DYfih6EZu.S9EYkSpbGuxq();
            m61Var2 = (zf8DYfih6EZu == null || (kd1Var = zf8DYfih6EZu.nLZGh9p8gVSu) == null) ? null : kd1Var.e9gEMXR7LXtO;
        }
        ab0 ab0Var2 = (ab0) m61Var;
        if ((ab0Var2 == null || !cs0.wdg6QnbFHrFF(ab0Var2.MDTGUQSX7PXD(), ab0Var.MDTGUQSX7PXD())) && (MDTGUQSX7PXD = ab0Var.MDTGUQSX7PXD()) != null) {
            ga0.Companion.getClass();
            int i6 = 5;
            if (i == 5) {
                ld.Companion.getClass();
            } else {
                i6 = 6;
                if (i == 6) {
                    ld.Companion.getClass();
                } else {
                    i6 = 3;
                    if (i == 3) {
                        ld.Companion.getClass();
                    } else {
                        i6 = 4;
                        if (i == 4) {
                            ld.Companion.getClass();
                        } else if (i == 1) {
                            ld.Companion.getClass();
                            i6 = 2;
                        } else if (i == 2) {
                            ld.Companion.getClass();
                            i6 = 1;
                        } else {
                            u9.rtx2ld2ELZv4("Unsupported direction for beyond bounds layout");
                        }
                    }
                }
            }
            if (MDTGUQSX7PXD.VhhvGxCb8gfr.PxuCJdSBwIXG.RAsUl2FVSrh6().r3s1LDPKFs1S <= 0 || MDTGUQSX7PXD.VhhvGxCb8gfr.PxuCJdSBwIXG.RAsUl2FVSrh6().dgRBjINgWbAK.isEmpty() || !MDTGUQSX7PXD.S9EYkSpbGuxq) {
                return le0Var.OPXfSBeufaJ8(wx0.pnx5pC0XzaCw);
            }
            boolean X1HMmH2Ks65g = MDTGUQSX7PXD.X1HMmH2Ks65g(i6);
            vy0 vy0Var = MDTGUQSX7PXD.VhhvGxCb8gfr;
            int min = X1HMmH2Ks65g ? Math.min(vy0Var.PxuCJdSBwIXG.RAsUl2FVSrh6().r3s1LDPKFs1S - 1, ((fz0) zk.kRWHK87H9qm4(vy0Var.PxuCJdSBwIXG.RAsUl2FVSrh6().dgRBjINgWbAK)).PxuCJdSBwIXG) : Math.max(0, ((hj1) vy0Var.PxuCJdSBwIXG.e9gEMXR7LXtO.lS5Rgt96tfkO).rtx2ld2ELZv4());
            zt1 zt1Var = new zt1();
            ef efVar = MDTGUQSX7PXD.S2OOm9zPNm0h;
            efVar.getClass();
            rx0 rx0Var = new rx0(min, min);
            efVar.PxuCJdSBwIXG.lS5Rgt96tfkO(rx0Var);
            zt1Var.rtx2ld2ELZv4 = rx0Var;
            jz0 jz0Var = MDTGUQSX7PXD.VhhvGxCb8gfr.PxuCJdSBwIXG;
            if (jz0Var.RAsUl2FVSrh6().dgRBjINgWbAK.isEmpty()) {
                i3 = 0;
            } else {
                ez0 RAsUl2FVSrh62 = jz0Var.RAsUl2FVSrh6();
                int RAsUl2FVSrh63 = (int) (RAsUl2FVSrh62.QrzZRwfaDlRX == th1.rtx2ld2ELZv4 ? RAsUl2FVSrh62.RAsUl2FVSrh6() & 4294967295L : RAsUl2FVSrh62.RAsUl2FVSrh6() >> 32);
                ez0 RAsUl2FVSrh64 = jz0Var.RAsUl2FVSrh6();
                List list = RAsUl2FVSrh64.dgRBjINgWbAK;
                if (list.isEmpty()) {
                    size = 0;
                } else {
                    int size2 = list.size();
                    int i7 = 0;
                    for (int i8 = 0; i8 < size2; i8++) {
                        i7 += ((fz0) list.get(i8)).dgRBjINgWbAK;
                    }
                    size = (i7 / list.size()) + RAsUl2FVSrh64.BRwzKIf41E4i;
                }
                if (size != 0 && (i4 = RAsUl2FVSrh63 / size) >= 1) {
                    i3 = i4;
                }
            }
            int i9 = i3 * 2;
            int i10 = MDTGUQSX7PXD.VhhvGxCb8gfr.PxuCJdSBwIXG.RAsUl2FVSrh6().r3s1LDPKFs1S;
            if (i9 > i10) {
                i9 = i10;
            }
            while (obj == null && MDTGUQSX7PXD.W7ceZOzvrRuI((rx0) zt1Var.rtx2ld2ELZv4, i6) && i2 < i9) {
                rx0 rx0Var2 = (rx0) zt1Var.rtx2ld2ELZv4;
                int i11 = rx0Var2.PxuCJdSBwIXG;
                int i12 = rx0Var2.lS5Rgt96tfkO;
                if (MDTGUQSX7PXD.X1HMmH2Ks65g(i6)) {
                    i12++;
                } else {
                    i11--;
                }
                ef efVar2 = MDTGUQSX7PXD.S2OOm9zPNm0h;
                efVar2.getClass();
                rx0 rx0Var3 = new rx0(i11, i12);
                efVar2.PxuCJdSBwIXG.lS5Rgt96tfkO(rx0Var3);
                MDTGUQSX7PXD.S2OOm9zPNm0h.PxuCJdSBwIXG.wdg6QnbFHrFF((rx0) zt1Var.rtx2ld2ELZv4);
                zt1Var.rtx2ld2ELZv4 = rx0Var3;
                i2++;
                zf8DYfih6EZu(MDTGUQSX7PXD).dgRBjINgWbAK();
                obj = le0Var.OPXfSBeufaJ8(new vx0(MDTGUQSX7PXD, zt1Var, i6));
            }
            MDTGUQSX7PXD.S2OOm9zPNm0h.PxuCJdSBwIXG.wdg6QnbFHrFF((rx0) zt1Var.rtx2ld2ELZv4);
            zf8DYfih6EZu(MDTGUQSX7PXD).dgRBjINgWbAK();
            return obj;
        }
        return null;
    }

    public static final void xfACYKDMU6Dj(ht0 ht0Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        ht0Var.getClass();
        cs0.wdg6QnbFHrFF(serialDescriptor.TSizfFm2Yiuu(), wa2.e9gEMXR7LXtO);
    }

    public static final vw0 zf8DYfih6EZu(tx txVar) {
        pd1 pd1Var = ((m61) txVar).rtx2ld2ELZv4.QrzZRwfaDlRX;
        if (pd1Var != null) {
            return pd1Var.VhhvGxCb8gfr;
        }
        throw o0.a92UlCVFR9N8("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }
}
